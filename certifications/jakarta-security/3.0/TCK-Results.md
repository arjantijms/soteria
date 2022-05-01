TCK Results
===========

As required by the
[Eclipse Foundation Technology Compatibility Kit License](https://www.eclipse.org/legal/tck.php),
following is a summary of the TCK results for releases of Jakarta Security.

# Eclipse Soteria 3.0.0, Certification Summary

- Product Name, Version and download URL (if applicable): <br/>
  [Eclipse Soteria 3.0.0-M5](https://github.com/eclipse-ee4j/soteria/releases/download/3.0.0-M5-RELEASE/jakarta.security.enterprise-3.0.0-M5.jar) uses Jakarta Security API 3.0
  [Eclipse Soteria Project](https://github.com/eclipse-ee4j/soteria)
  Vehicle: [Eclipse Glassfish 7.0.0-M4](https://repo1.maven.org/maven2/org/glassfish/main/distributions/glassfish/7.0.0-M4/glassfish-7.0.0-M4.zip)
- Specification Name, Version and download URL: <br/>
  [Jakarta Security 3.0](https://jakarta.ee/specifications/security/3.0)
- TCK Version, digital SHA-256 fingerprint and download URL: <br/>
  Staged: [Jakarta Security 3.0, TCK](http://download.eclipse.org/ee4j/jakartaee-tck/jakartaee10/staged/eftl/jakarta-security-tck-3.0.0.zip)
  , SHA-256: `c5235d3ef2a5ecdde7bfdfc7d2d808f7a84502c1b9096027ea47528eb7499536`
- Public URL of TCK Results Summary: <br/>
  [TCK results summary](TCK-Results.html)
- Any Additional Specification Certification Requirements: <br/>
  None
- Java runtime used to run the implementation: <br/>
  OpenJDK 11.0.2, 17.0.1
- Summary of the information for the certification environment, operating system, cloud, ...: <br/>
  Debian GNU/Linux 10

Test results:

```
[INFO]      [exec] [javatest.batch] Number of Tests Passed      = 84
[INFO]      [exec] [javatest.batch] Number of Tests Failed      = 0
[INFO]      [exec] [javatest.batch] Number of Tests with Errors = 0
[INFO]      [exec] [javatest.batch] ********************************************************************************
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/autoapplysession/Client.java#testAutoApplySession
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/basic/Client.java#testBasicHAMHasCorrectQualifier
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/basic/Client.java#testBasicHAMValidateRequest
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/basic/Client.java#testBasicHAMValidateRequest_wrongPassword
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/customform/base/Client.java#testCustomFormHAMHasCorrectQualifier
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/customform/base/Client.java#testCustomFormHAMValidateRequest
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/customform/base/Client.java#testCustomFormLoginToContinueErrorPage
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/customform/base/Client.java#testLoginToContinueuseRedirectToLogin
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/customform/expression/Client.java#testLoginToContinueuseForwardToLoginExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/form/Client.java#testFormHAMHasCorrectQualifier
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/form/Client.java#testFormHAMValidateRequest
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/form/Client.java#testLoginToContinueerrorPage
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/form/Client.java#testLoginToContinueLoginPage
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test1/Client.java#testRememberMecookieHttpOnly
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test1/Client.java#testRememberMecookieMaxAgeSeconds
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test1/Client.java#testRememberMeCookieNameandisRememberMeExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test2/Client.java#testRememberMecookieHttpOnlyFalse
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test2/Client.java#testRememberMecookieSecureOnly
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test3/Client.java#testRememberMecookieHttpOnlyExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test3/Client.java#testRememberMecookieMaxAgeSecondsExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test3/Client.java#testRememberMecookieSecureOnlyExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/rememberme/test3/Client.java#testRememberMeisRememberMe
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/sam/obtainbean/Client.java#testSAMObtainBean
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/workflow/cleansubject/Client.java#testHAMCleanSubject
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/workflow/secureresponse/Client.java#testHAMSecureResponse
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/workflow/validaterequest/Client.java#testCallValidateRequestBeforeService
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/workflow/validaterequestduringauthen/Client.java#testCallValidateRequestDuringAuthenticate
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/ham/workflow/validaterequestwithfilter/Client.java#testCallValidateRequestBeforeFilter
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/basic/Client.java#testIdentityStoreInstall
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/customhandler/Client.java#testIdentityStore_customHandler
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/basic/Client.java#testAnnotationDBIDStore_Basic
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/hashalgorithm/Client.java#testAnnotationDBIDStore_HashAlgorithmDefault
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/hashalgorithmparam/Client.java#testAnnotationDBIDStore_HashAlgorithmParam
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/invalidcallerquery/Client.java#testAnnotationDBIDStore_Invalidcallerquery
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/invaliddatasource/Client.java#testAnnotationDBIDStore_Invaliddatasource
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/invalidgroupsquery/Client.java#testAnnotationDBIDStore_Invalidgroupsquery
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/invalidhashalgorithmparam/Client.java#testAnnotationDBIDStore_InvalidHashAlgorithmParam
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/invalidpriorityuseforexpr/Client.java#testAnnotationDBIDStore_invalidpriorityuseforexpr
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/multi/Client.java#testAnnotationDBIDStore_multi_withLdap
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/notvalidated/Client.java#testAnnotationDBIDStore_notValidated
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/priorityuseforexpr/Client.java#testAnnotationDBIDStore_priorityuseforexpr
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/priorityuseforexprbean/Client.java#testAnnotationDBIDStore_priorityuseforexprbean
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/useforgroup/Client.java#testAnnotationDBIDStore_useforgroup
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/database/useforvalidation/Client.java#testAnnotationDBIDStore_useforvalidation
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/idstorepermission/Client.java#testIdentityStore_customHandlerWithoutIDStorePermission
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/basic/Client.java#testAnnotationLdapIDStore_Basic
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/binddn/Client.java#testAnnotationLdapIDStore_Binddn
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/groupmemberof/Client.java#testAnnotationLdapIDStore_groupMemberOf
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/groupmemberofnotexist/Client.java#testAnnotationLdapIDStore_groupMemberOfNotExist
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidbinddn/Client.java#testAnnotationLdapIDStore_invalidBinddn
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidbinddnpassword/Client.java#testAnnotationLdapIDStore_invalidBinddnPassword
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidcallerbasedn/Client.java#testAnnotationLdapIDStore_invalidCallerBasedn
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidcallernameattr/Client.java#testAnnotationLdapIDStore_invalidCallerNameAttribute
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidcallersearchbase/Client.java#testAnnotationLdapIDStore_invalidCallerSearchBase
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidcallersearchfilter/Client.java#testAnnotationLdapIDStore_invalidCallerSearchFilter
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidgroupmemberattr/Client.java#testAnnotationLdapIDStore_invalidGroupMemberAttribute
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidgroupnameattr/Client.java#testAnnotationLdapIDStore_invalidGroupNameAttribute
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidgroupsearchbase/Client.java#testAnnotationLdapIDStore_invalidGroupSearchBase
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidgroupsearchfilter/Client.java#testAnnotationLdapIDStore_invalidGroupSearchFilter
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidsearchscopeexpr/Client.java#testAnnotationLdapIDStore_invalidsearchScopeExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/invalidurl/Client.java#testAnnotationLdapIDStore_invalidURL
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/notvalidated/Client.java#testAnnotationLdapIDStore_NotValidated
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/priorityuseforexpr/Client.java#testIdentityStore_ldap_priorityuseforexpr
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/searchscopebothonelevel/Client.java#testAnnotationLdapIDStore_searchScopeBothOneLevel
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/searchscopebothsubtree/Client.java#testAnnotationLdapIDStore_searchScopeBothSubTree
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/searchscopecalleronelevelgroupsubtree/Client.java#testAnnotationLdapIDStore_searchScopeCallerOneLevelGroupSubTree
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/searchscopecallersubtreegrouponelevel/Client.java#testAnnotationLdapIDStore_searchScopeCallerSubTreeGroupOneLevel
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/searchscopeexpr/Client.java#testAnnotationLdapIDStore_searchScopeExpression
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/useforgroup/Client.java#testIdentityStore_ldap_useforgroup
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/ldap/useforvalidation/Client.java#testIdentityStore_ldap_useforvalidation
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multi/Client.java#testIdentityStoreValidate_multiIDStore
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multi/Client.java#testIdentityStoreValidate_multiIDStore_INVALID
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multi/Client.java#testIdentityStoreValidate_multiIDStore_INVALIDWithNOTVALIDATED
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multi/Client.java#testIdentityStoreValidate_multiIDStore_NOTVALIDATED
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multiauthz/Client.java#testIdentityStore_getGroups_multiGroupStore_highPriority_valid
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/multiauthz/Client.java#testIdentityStore_getGroups_multiGroupStore_lowerPriority_valid
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/useforgroup/Client.java#testIdentityStore_validationType_useforgroup
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/idstore/useforvalidation/Client.java#testIdentityStore_validationType_useforvalidation
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/authenticate/Client.java#testSecurityContextAuthenticate
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/authenticate/Client.java#testSecurityContextAuthenticate_wrongCredential
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/callerdata/Client.java#testSecurityContextHasAccessToWebResource
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/callerdata/Client.java#testSecurityContextIsCallerInRole
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/ejb/Client.java#testSecurityContextAvailableInEJB
[INFO]      [exec] [javatest.batch] PASSED........com/sun/ts/tests/securityapi/securitycontext/getprincipalsbytype/Client.java#testSecurityContextGetPrincipalsByType
[INFO]      [exec] [javatest.batch] 
[INFO]      [exec] [javatest.batch] Total time = 213s
[INFO]      [exec] [javatest.batch] Setup time = 0s
[INFO]      [exec] [javatest.batch] Cleanup time = 0s
[INFO]      [exec] [javatest.batch] Test results: passed: 84
[INFO]      [exec] [javatest.batch] Results written to /home/jenkins/agent/workspace/2_security-run-tck-against-staged-build/jakarta-security-tck-3.0.0/old-tck/run/target/security-tck/securitywork/security.
[INFO]      [exec] [javatest.batch] Report written to /home/jenkins/agent/workspace/2_security-run-tck-against-staged-build/jakarta-security-tck-3.0.0/old-tck/run/target/security-tck/securityreport/security
[INFO]      [exec] 
[INFO]      [exec] BUILD SUCCESSFUL
[INFO]      [exec] Total time: 3 minutes 36 seconds
[INFO]      [exec] Picked up JAVA_TOOL_OPTIONS: -XX:+IgnoreUnrecognizedVMOptions -XX:+UnlockExperimentalVMOptions 
[INFO]      [exec] Waiting for the domain to stop 
[INFO]      [exec] Command stop-domain executed successfully.
[INFO] Executed tasks
[INFO] 
[INFO] --- maven-failsafe-plugin:3.0.0-M5:integration-test (default) @ glassfish-external-tck-security ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-failsafe-plugin:3.0.0-M5:verify (default) @ glassfish-external-tck-security ---
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ glassfish-external-tck-security ---
[INFO] Installing /home/jenkins/agent/workspace/2_security-run-tck-against-staged-build/jakarta-security-tck-3.0.0/old-tck/run/pom.xml to /home/jenkins/.m2/repository/org/eclipse/ee4j/security/tck/glassfish-external-tck-security/3.0.0/glassfish-external-tck-security-3.0.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for Jakarta Security TCK - main 3.0.0:
[INFO] 
[INFO] Jakarta Security TCK - main ........................ SUCCESS [ 47.478 s]
[INFO] common ............................................. SUCCESS [ 10.188 s]
[INFO] app-securitycontext ................................ SUCCESS [ 26.901 s]
[INFO] app-securitycontext-auth ........................... SUCCESS [ 20.864 s]
[INFO] app-securitycontext-customprincipal ................ SUCCESS [ 21.365 s]
[INFO] app-mem ............................................ SUCCESS [ 20.861 s]
[INFO] app-db ............................................. SUCCESS [ 24.448 s]
[INFO] app-ldap ........................................... SUCCESS [ 23.750 s]
[INFO] app-ldap2 .......................................... SUCCESS [ 22.977 s]
[INFO] app-ldap3 .......................................... SUCCESS [ 23.357 s]
[INFO] app-custom ......................................... SUCCESS [ 20.938 s]
[INFO] app-multiple-store ................................. SUCCESS [ 20.832 s]
[INFO] app-multiple-store-backup .......................... SUCCESS [ 21.139 s]
[INFO] app-openid ......................................... SUCCESS [ 31.886 s]
[INFO] app-openid2 ........................................ SUCCESS [ 45.022 s]
[INFO] app-openid3 ........................................ SUCCESS [ 39.873 s]
[INFO] app-mem-basic ...................................... SUCCESS [ 22.669 s]
[INFO] app-mem-basic-decorate ............................. SUCCESS [ 21.883 s]
[INFO] app-mem-form ....................................... SUCCESS [ 23.730 s]
[INFO] app-mem-customform ................................. SUCCESS [ 25.201 s]
[INFO] app-custom-session ................................. SUCCESS [ 22.218 s]
[INFO] app-custom-rememberme .............................. SUCCESS [ 28.188 s]
[INFO] app-custom-identity-store-handler .................. SUCCESS [ 22.527 s]
[INFO] app-jaxrs .......................................... SUCCESS [ 21.398 s]
[INFO] Old Jakarta Security TCK - build ................... SUCCESS [02:22 min]
[INFO] Old Jakarta Security TCK - main .................... SUCCESS [  1.173 s]
[INFO] Old Jakarta Security TCK - run ..................... SUCCESS [05:55 min]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  18:29 min
[INFO] Finished at: 2022-04-25T23:25:27Z
[INFO] ------------------------------------------------------------------------
SHA256_API=
SHA256_IMPL=
SHA256_TCK=c5235d3ef2a5ecdde7bfdfc7d2d808f7a84502c1b9096027ea47528eb7499536
TCK_download=http://download.eclipse.org/ee4j/jakartaee-tck/jakartaee10/staged/eftl/jakarta-security-tck-3.0.0.zip
OS2=Debian GNU/Linux 10
OS3=10.12
OS4=PRETTY_NAME="Debian GNU/Linux 10 (buster)" NAME="Debian GNU/Linux" VERSION_ID="10" VERSION="10 (buster)" VERSION_CODENAME=buster ID=debian HOME_URL="https://www.debian.org/" SUPPORT_URL="https://www.debian.org/support" BUG_REPORT_URL="https://bugs.debian.org/"
JDK_VERSION=openjdk version "11.0.2" 2019-01-15 OpenJDK Runtime Environment 18.9 (build 11.0.2+9) OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)
JDK_VERSION=openjdk version "17.0.1" 2021-10-19 OpenJDK Runtime Environment (build 17.0.1+12-39)  OpenJDK 64-Bit Server VM (build 17.0.1+12-39, mixed mode, sharing)
```
