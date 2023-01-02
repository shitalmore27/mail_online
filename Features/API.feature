Feature: API Test feature
@API
Scenario:API Scenario
Given As a owner add new pet to the store with the below data
| url		| petId		| categoryId	| categoryName	| petName		| photoUrls						| tagsId	| tagsName	| status		|
| /pet	    | 10		| 0				| dog			| doggie		| \\src\\image\\download.jpg	| 0			| test		| available		|
When search pet ID with "10"
Then delete the pet profile by id "10"
Then End test case

