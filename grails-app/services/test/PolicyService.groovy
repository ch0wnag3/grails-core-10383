package test

import grails.gorm.transactions.Transactional

@Transactional
class PolicyService {

    @Transactional(readOnly = true)
    Policy getMyPolicy() {
        return Policy.findByCompanyAndRootAndSuffix("01", "158930", "01")
    }

}
