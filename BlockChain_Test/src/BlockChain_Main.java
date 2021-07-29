import java.util.ArrayList;

public class BlockChain_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Block> blockChain = new ArrayList<Block>();
		
		String[] initialValues = {"Linus has 700 Euro", "Florian has 500 Euro"};
		Block firstblock = new Block(initialValues, 0);
		blockChain.add(firstblock);
		System.out.println("Erster Block ist " + firstblock.toString());
		System.out.println("Die block chain ist" + blockChain.toString());
		
		
		
		String[] payBlock = {"Florian gives Linus 400 Euro", "Thomas buy 800 Euro"};
		Block secondblock = new Block(payBlock, firstblock.getBlockHash());
		blockChain.add(secondblock);
		System.out.println("Zweiter Block ist " + secondblock.toString());
		System.out.println("Die block chain ist" + blockChain.toString());
		
		String[] payBack = {"Linus gives Florian 400 Euro"};
		Block thirdblock = new Block(payBack, secondblock.getBlockHash());
		blockChain.add(thirdblock);
		System.out.println("Zweiter Block ist " + thirdblock.toString());
		System.out.println("Die block chain ist" + blockChain.toString());
		
	}

}
