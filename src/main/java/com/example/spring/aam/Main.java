package com.example.spring.aam;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.aam.model.IAsset;
import com.example.spring.aam.model.IAssetType;

public class Main {
	public static void main(String[] args) {
		// prepare the spring application
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"AAMSpring.xml");

		// are we being called with arguemtns?
		if (args.length > 0) {
			String command = args[0];
			// get the serivce bean
			AAMService service = (AAMService) context.getBean("AAMService");

			try {
				switch (command) {
				case "AddAssetType":
					if (args.length != 2) {
						throw new IllegalArgumentException(
								"AddAssetType requires one argument.");
					}

					IAssetType assetType = service.addAssetType(args[1]);
					if (assetType == null) {
						System.out.format("AssetType '%s' already exists%n",
								args[1]);
					} else {
						System.out.format("AssetType '%s' has been added%n",
								assetType.getAssetTypeName());
					}
					break;
				case "UpdateAssetType":
					if (args.length != 3) {
						throw new IllegalArgumentException(
								"UpdateAssetType requires two arguments.");
					}

					IAssetType updatedAssetType = service.updateAssetType(
							args[1], args[2]);
					if (updatedAssetType == null) {
						System.out.format("AssetType '%s' does not exist%n",
								args[1]);
					} else {
						System.out.format(
								"AssetType: '%s' has been updated to '%s'%n",
								args[1], updatedAssetType.getAssetTypeName());
					}
					break;
				case "DeleteAssetType":
					if (args.length != 2) {
						throw new IllegalArgumentException(
								"DeleteAssetType requires one argument.");
					}

					IAssetType deletedAssetType = service
							.deleteAssetType(args[1]);
					if (deletedAssetType == null) {
						System.out.format("AssetType '%s' does not exist%n",
								args[1]);
					} else if (!deletedAssetType.getResources().isEmpty()) {
						System.out.format("AssetType '%s' has resources.",
								deletedAssetType.getAssetTypeName());
					} else {
						System.out.format("AssetType '%s' has been deleted.",
								deletedAssetType.getAssetTypeName());
					}
					break;

				case "ListAssetTypes":
					List<IAssetType> toPrint = service.getAssetTypeAssetList();
					for (IAssetType a : toPrint) {
						System.out.println(a.getAssetTypeName());
					}
					break;

				case "ListAssets":
					if (args.length == 1) {
						List<IAsset> print = service.ListAssets();
						for (IAsset a : print) {
							System.out.println(a.toString());
						}
						break;

					}
					if (args.length == 2) {
						System.out.println(service.ListAssets(args[1]));
						break;
					}

					if (args.length == 3) {
						List<IAsset> print = service.ListAssets(args[1],
								args[2]);
						for (IAsset a : print) {
							System.out.println(a.toString());
						}
						break;

					} else {
						throw new IllegalArgumentException(
								"incorrect amount of parameters");
					}
				case "AddAsset":
					if (args.length != 4) {
						throw new IllegalArgumentException("parameters wrong");

					} else {
						boolean added = service.addAsset(args[1], args[2],
								args[3]);
						if (added) {
							System.out.println("Added asset");
						} else {
							System.out.println("Not added");
						}
						break;
					}
				case "updateAsset":
					if (args.length != 5) {
						throw new IllegalArgumentException(
								"Too many or not enough params");

					} else {
						boolean success = service.updateAsset(args[1], args[2],
								args[3], args[4]);
						if (success) {
							System.out.println("updated that shit");
						} else {
							System.out.println("didn't work");
						}
						break;

					}
				case "DeleteAsset":
					boolean success = false;
					if (args.length == 2) {
						success = service.deleteAsset(args[1]);
					} else if (args.length == 3) {
						success = service.deleteAsset(args[1], args[2]);

					} else if (args.length > 3) {
						throw new IllegalArgumentException("you got no fansss");
					}

					if (success) {
						System.out.println("asset deleted");
					} else {
						System.out.println("asset not deleted");
					}

					break;
				default:
					System.out.println("Unknown command: '" + command + "'");
					System.out.println(Main.getUsage());
				}
			} catch (IllegalArgumentException e) {
				System.err.println(e.getMessage());
				System.err.println(Main.getUsage());
			}
		} else {
			System.out.println(Main.getUsage());
		}
	}

	/**
	 * 
	 * @return the usage of the program
	 */
	public static String getUsage() {
		return "AddAssetType <assetTypeName>\n"
				+ "UpdateAssetType <assetTypeName> <newAssetTypeName>\n"
				+ "DeleteAssetType <assetTypeName>\n";
	}
}
