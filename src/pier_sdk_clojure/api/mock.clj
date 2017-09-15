(ns pier-sdk-clojure.api.mock
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn alterar-produto-using-post-with-http-info
  "Altera o produto associado Ã  conta.
  O recurso permite fazer modificaÃ§Ã£o do produto associado Ã  conta."
  [id request ]
  (call-api "/api/contas/{id}/alterar-produto" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-produto-using-post
  "Altera o produto associado Ã  conta.
  O recurso permite fazer modificaÃ§Ã£o do produto associado Ã  conta."
  [id request ]
  (:data (alterar-produto-using-post-with-http-info id request)))

(defn enviar-fatura-email-using-post-with-http-info
  "Envia 2Âª via de fatura por E-mail
  Envia a segunda via da fatura para o e-mail informado/cadastrado."
  ([id data-vencimento ] (enviar-fatura-email-using-post-with-http-info id data-vencimento nil))
  ([id data-vencimento {:keys [email ]}]
   (call-api "/api/contas/{id}/faturas/{dataVencimento}/enviar-email" :post
             {:path-params   {"id" id "dataVencimento" data-vencimento }
              :header-params {}
              :query-params  {"email" email }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn enviar-fatura-email-using-post
  "Envia 2Âª via de fatura por E-mail
  Envia a segunda via da fatura para o e-mail informado/cadastrado."
  ([id data-vencimento ] (enviar-fatura-email-using-post id data-vencimento nil))
  ([id data-vencimento optional-params]
   (:data (enviar-fatura-email-using-post-with-http-info id data-vencimento optional-params))))

(defn simular-emprestimo-financiamento-using-post-with-http-info
  "Simula valores de prestaÃ§Ãµes de emprÃ©stimos/financiamentos
  Esta operaÃ§Ã£o pode ser utilizada para simular operaÃ§Ãµes financeiras a partir de informaÃ§Ãµes fornecidas pelo usuÃ¡rio. Os cÃ¡lculos gerados devem ser considerados apenas como referÃªncia para as situaÃ§Ãµes reais e nÃ£o como valores oficiais."
  [request ]
  (call-api "/api/simular-emprestimos-financiamentos" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-emprestimo-financiamento-using-post
  "Simula valores de prestaÃ§Ãµes de emprÃ©stimos/financiamentos
  Esta operaÃ§Ã£o pode ser utilizada para simular operaÃ§Ãµes financeiras a partir de informaÃ§Ãµes fornecidas pelo usuÃ¡rio. Os cÃ¡lculos gerados devem ser considerados apenas como referÃªncia para as situaÃ§Ãµes reais e nÃ£o como valores oficiais."
  [request ]
  (:data (simular-emprestimo-financiamento-using-post-with-http-info request)))

(defn visualizar-documento-using-post-with-http-info
  "Permite visualizar o extrato da fatura em formato PDF
  Esta operaÃ§Ã£o permite visualizar o extrato da fatura de uma determinada conta, em formato PDF. Quando ela for a fatura ativa, ou seja, a do mÃªs corrente, o pdf serÃ¡ composto pelo extrato de lanÃ§amentos e pela ficha de compensaÃ§Ã£o bancÃ¡ria. Quando for de uma fatura do histÃ³rico do cliente, o PDF serÃ¡ composto apenas pelo extrato de transaÃ§Ãµes."
  [id data-vencimento ]
  (call-api "/api/contas/{id}/faturas/{dataVencimento}/arquivo.pdf" :post
            {:path-params   {"id" id "dataVencimento" data-vencimento }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/pdf" "*/*"]
             :auth-names    []}))

(defn visualizar-documento-using-post
  "Permite visualizar o extrato da fatura em formato PDF
  Esta operaÃ§Ã£o permite visualizar o extrato da fatura de uma determinada conta, em formato PDF. Quando ela for a fatura ativa, ou seja, a do mÃªs corrente, o pdf serÃ¡ composto pelo extrato de lanÃ§amentos e pela ficha de compensaÃ§Ã£o bancÃ¡ria. Quando for de uma fatura do histÃ³rico do cliente, o PDF serÃ¡ composto apenas pelo extrato de transaÃ§Ãµes."
  [id data-vencimento ]
  (:data (visualizar-documento-using-post-with-http-info id data-vencimento)))
