package test

class Policy {

    static constraints = {
    }

    static mapping = {
        datasource "nexus"
        table name: "FBPOLICY", schema: "FBNEXUS"
        id column: "POLICYID"
        version false
        company column: "COMPANY"
        root column: "FBROOT"
        suffix column: "SUFFIX"
        lineOfBusiness column: "LOB"
    }

    static transients = [
            "policyNumber"
    ]

    String company
    String root
    String suffix
    String lineOfBusiness

    String getPolicyNumber() {
        return "${company}-${root}-${suffix}"
    }

}
