(ns mapping-store.handler-test
  (:use clojure.test
        ring.mock.request
        mapping-store.handler))

(deftest test-app
  (testing "users endpoit"
    (let [response (app (request :get "/user"))]
      (is (= (:status response) 200))
      (is (= (get-in response [:headers "Content-Type"]) "application-json"))))

  (testing "not-found route"
    (let [response (app (request :get "/bogus-route"))]
      (is (= (:status response) 404)))))