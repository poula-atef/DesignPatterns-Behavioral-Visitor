# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Visitor Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- بيتم استخدام ال Design Pattern ده في الحالات اللي مش بينفع فيها ال Polymorphism عشان نعمل Overloading ل method معينه.
- حاله زي اللي في البرنامج مينفعش نستخدم ال PaymentMethod object و نعمل calling ل method بعينها علي حسب ال initialization اللي هيحصل لل Cinema object لان ال compiler لازم هيطلب نعمل casting لل object لواحد من ال children بتوعه او لو في method بتاخد parameter من نوع ال parent (وهي موجوده في المثال ده) مش هيطلب انك تعمل casting لكن هيختار ال parent method ديما ايا يكن ال initialized class لل object ده.
- لان ال initialization بيحصل في ال runtime و بالتالي ال compiler مش هيكون عارف ال object ده هيبقي نوعه ايه في خلال ال compile time.
- ال compiler مش بيسمح ان يكون في غموض او ان النوع بتاع object يتحدد بعد ال compile time عشان كده ديما هيختار الاختيار اللي ينهي اي جدل او اي غموض قبل ال runtime مايبدأ.  
## المشكله:
- عشان نوصل لل method المطلوبه (في المثال ده عايزين ال method اللي بتاخد parameter من نوع SunCityCinema) في 3 حلول و هما: 
	- اني اعمل cast لل object كل مره بناء علي نوعه.
	- اني اعمل declaration لل object من نوع ال child.
	- ان ال client مش هو اللي يحدد ال method اللي هيحصلها calling.
## الحلول:
- اول حل لو عملناه هنضطر اننا نعمل conditions بحيث اني اعرف ال object ده من نوع ايه عشان اقدر اعمل downcasting لل object للنوع ده .. و الحل ده مش ال best practice.
- تاني حل لو عملناه هنضطر اننا نعمل objects من كل الانواع و نستخدم منهم واحد بس بناء علي النوع اللي محتاجينه .. و الحل ده مش ال best practice.
- تالت حل وهو حل المشكله الامثل هو اننا مانحددش نوع ال method اللي هيحصلها calling و نسيب الكود هو اللي يقرر .. و ده اننا نخلي كل class هو اللي بيعمل calling لل method
بناء علي نوعه هو .. و ده technique اسمه [Double Dispatch](https://github.com/poula-atef/Double-Dispatching-Example) و هو انه بيخلي ال class نفسه هو اللي يختار ال method من ال visitor بناء علي نوع
ال class نفسه لان ال class هو الوحيد اللي هيبقي عارف ال type بتاعه في ال compile time.
# بيتكون من ايه البرنامج ده ؟
 - ال package بتاعت ال payment:
   - ال PaymentMethod Interface و ده فيه ال methods اللي المفروض تكون في اي payment method
   - ال CreditCardPaymentMethod Class و ده بيعمل implementation لل payment interface
   - ال CashPaymentMethod Class و ده بيعمل implementation لل payment interface
 - ال package بتاعت ال cinema:
   - ال Cinema Interface و ده فيه ال methods اللي المفروض تكون في اي cinema
   - ال IMAXCinema Class و ده بيعمل implementation لل cinema interface
   - ال SunCityCinema Class و ده بيعمل implementation لل cinema interface
