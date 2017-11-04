///********************************************************************
//
////  CDCollection.java       Author: Lewis/Loftus
// * modified by
// * @author harmssk
//  Represents a collection of compact discs.
//
//  	/**
//	 * Could also have the following methods:
//	 *  getCDi method to return a copy of the CD in location i
//	 *  findCC(String findTitle) method to find a copy of the CD with the findTitle title.
//	 *  contains(CD c) method returns true of the collection contains the CD c with this CD's title and artist \
//	 *  copy constructor - make sure it performs deep, deep, deep copies
//	 *  setCollection(CD[]) - to set the array of CDs in the collection to be a COPY of the input array of CDs
//	 *  and other methods that you could think of
//********************************************************************/
//
//import java.text.NumberFormat;
//
//public class CDCollection
//{
//	private CD[] collection;
//	private int count;
//	private double totalCost;
//
//	/**-----------------------------------------------------------------
//	//  Creates an initially empty (null) collection.
//	//-----------------------------------------------------------------*/
//	public CDCollection ()
//	{
//		collection = null;
//		count = 0;
//		totalCost = 0.0;
//	}
//
//	/**-----------------------------------------------------------------
//	//  Creates an initially empty collection, that can contain the numberOfCDs
//	//-----------------------------------------------------------------*/
//	public CDCollection (int numberOfCDs)
//	{
//		collection = new CD[numberOfCDs];
//		//remember - each of the CDs in the array are still null
//		count = 0;
//		totalCost = 0.0;
//	}
//
//	/**-----------------------------------------------------------------
//	//  Adds a CD to the collection, increasing the size of the
//	//  collection if necessary.
//	//-----------------------------------------------------------------*/
//	public void addCD (String title, String artist, double cost,
//			int tracks)
//	{
//		if (collection == null || count == collection.length)
//			increaseSize();
//
//		//put the new CD in the next open spot
//		collection[count] = new CD (title, artist, cost, tracks);
//		totalCost += cost;
//		count++;
//	}
//
//	/**
//	 * Make a copy of both the collection and each object in the array
//	 * return a deep, deep copy
//	 * @return
//	 */
//	public CD[] getCollection()
//	{
//		CD[] temp = new CD[count];
//		for (int i=0;i<count;i++)
//			temp[i] = new CD(collection[i]);
//		return temp;
//	}
//
//	/**-----------------------------------------------------------------
//	//  Returns a report describing the CD collection.
//	//-----------------------------------------------------------------*/
//	public String toString()
//	{
//		String report = "";
//		if (collection != null && count>0)
//		{
//			NumberFormat fmt = NumberFormat.getCurrencyInstance();
//
//			report += "My CD Collection\n\n";
//
//			report += "Number of CDs: " + count + "\n";
//			report += "Total cost: " + fmt.format(totalCost) + "\n";
//			report += "Average cost: " + fmt.format(totalCost/count);
//
//			report += "\n\nCD List:\n";
//
//			//only output cds that have been added, even if the array can hold more
//			for (int cd = 0; cd < count; cd++)
//				report += collection[cd].toString() + "\n";
//		}
//		else
//			report = "Empty Collection";
//
//		return report;
//	}
//
//	/**-----------------------------------------------------------------
//	//  Doubles the size of the collection by creating a larger array
//	//  and copying the existing collection into it.
//	//-----------------------------------------------------------------*/
//	private void increaseSize ()
//	{
//		if (collection == null)
//		{
//			collection = new CD[2]; //double the size from 0 to 2
//			for (int i = 0; i<2; i++)
//				collection[i] = new CD();
//		}
//		else
//		{
//			CD[] temp = new CD[collection.length * 2];
//
//			for (int cd = 0; cd < collection.length; cd++)
//				temp[cd] = collection[cd];
//
//			collection = temp;
//		}
//	}
//}
