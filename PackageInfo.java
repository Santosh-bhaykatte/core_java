package core_Java;

//1. code organization
//2. avoid name conflicts
//3. access control
//4. JSL -> built in packages
//5. package keyword -> custom packages
//6. import keyword -> import classes from other packages

public class PackageInfo {
    public static void main(String[] args) {
        Package p = Package.getPackage("java.lang");

        System.out.println("Package name: "+ p.getName());

        System.out.println("Specification title: "+ p.getSpecificationTitle());
        System.out.println("Specification vendor: "+ p.getSpecificationVendor());
        System.out.println("Specification version: "+ p.getSpecificationVersion());

        System.out.println("Implementation title: "+ p.getImplementationTitle());
        System.out.println("Implementation vendor: "+ p.getImplementationVendor());
        System.out.println("Implementation version: "+ p.getImplementationVersion());
    }
}
