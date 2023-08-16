import kotlin.random.Random;

//@throws RuntimeException
fun readGuess(): Int
{
  // Read a line of console input, split by words and convert to Int
  // May throw RExcept
	return readln().split( ' ' )[0].toInt();
}

fun main( args: Array<String> )
{
  // Generate a random number between 0 and 100
	val number = Random.nextInt( 0, 100 );

  // Obligatory Hello world
	println( "Hello world!" );
  
  println( "Guess a number (0<x<100)!" );

  // Loop 5 times
	for ( i in 1..5 )
	{
		println( "Guess #$i" );

    // Read the guess
		val guess = readGuess();	
    
		println( "Your guess: $guess" );

		if ( guess < number ) println( "Too low!" );
		else if ( guess > number ) println( "Too high!" );
		else
		{
			println( "Correct!" );
			break;
		}
	}

	println( "Number was $number" );
}
