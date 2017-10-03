package test

class PolicyController {

    PolicyService policyService

    def index() {
        Policy policy = policyService.getMyPolicy()
        render policy.policyNumber
    }

}
