<div dir="rtl">
 
##  آزمایش هشتم آزمایشگاه نرم‌افزار - Refactoring

 
* کامیت اول (facade): تغییراتی که در این کامیت انجام شده، با ایجاد یک کلاس فاساد به نام AddressFactory است که فرایند ایجاد نمونه‌های Address را ساده‌سازی می‌کند. این کلاس جدید، با استفاده از کلاس AddressStrings، پارامترهای لازم برای ایجاد شی‌های Address را در بر می‌گیرد. این به این معناست که سایر بخش‌های سیستم حالا با یک رابط کاربری ساده‌تر که توسط AddressFactory ارائه می‌شود تعامل دارند، که به نگهداری و ماژولاریتی بهتر کد کمک می‌کند.
* کامیت دوم (facade): اینبار در کلاس scanner این refactoring انجام شده و کلاس جدیدی به نام ScannerFactory اضافه شده است که وظیفه‌اش تبدیل نام‌های نوع داده‌ها به نوع موردنظر است. این کلاس در دیگر بخش‌های کد استفاده می‌شود تا کار تبدیل انواع داده‌ها را مرکزی‌سازی کند. به این ترتیب، هر جا که نیاز به تعیین نوع داده است، به جای تکرار کدهای مشابه در نقاط مختلف، از این کلاس استفاده می‌شود، که به تمیز کردن و سازمان‌دهی بهتر کد کمک می‌کند.
* کامیت سوم (Optional: Encapsulated field): در اینجا یک سری متغیر پابلیک داریم که باید private شده و برای آن‌ها setter و getter هم تعریف کردیم که اگر از بیرون دسترسی نیاز بود بدین صورت انجام شود.
* کامیت چهارم (Optional: Extract Methods): کد تکراری و زیاد داشتیم پس اینجا تغییر اصلی استخراج بلوک‌های کد تکراری به یک متد جدید به نام performOperation بود. این متد جدید عملیات‌های ریاضی مانند جمع، تفریق و ضرب را انجام می‌دهد و کد را تمیزتر و قابل مدیریت‌تر می‌کند. این تغییر کمک می‌کند تا کدهای تکراری در نقاط مختلف برنامه حذف شوند.
* کامیت پنجم (SeperateQueryFromModifier): توابعی که پیش‌تر وظایف پرس‌وجو (بازگرداندن اطلاعات) و تغییردهنده (تغییر داده‌ها) را همزمان انجام می‌دادند، بازنویسی شده‌اند تا این دو عملکرد را از هم جدا کنند. این تغییر سبب می‌شود که خوانایی و قابلیت نگهداری کد بهبود یابد. به عنوان مثال، توابعی که فقط باید داده‌ها را بازخوانی کنند، اکنون هیچ تغییری در داده‌ها ایجاد نمی‌کنند، و توابعی که داده‌ها را تغییر می‌دهند، دیگر هیچ داده‌ای را برنمی‌گردانند.
* کامیت ششم (Self Encapsulated Field): مشابه کامیت سوم منتها اینجا متغیر private داریم و در خود کلاس باید setter و getter اضافه می‌کردیم.
* کامیت هفتم (Strategy): در این کامیت، استراتژی رفتاری (Strategy Pattern) برای تعریف و اعمال رفتارهای مختلف در زمان اجرا استفاده شده است. کلاس‌هایی مانند AcceptStrategy, ShiftStrategy, و ReduceStrategy ایجاد شده‌اند که هر کدام رفتار خاصی را پیاده‌سازی می‌کنند و از یک رابط مشترک ActionStrategy استفاده می‌کنند. این ساختار اجازه می‌دهد که رفتارهای مختلف به صورت ماژولار و قابل تغییر در زمان اجرا اعمال شوند، که به انعطاف‌پذیری و توسعه‌پذیری کد کمک می‌کند.

 ## اضافه کردن پلاگین formatter:
  ![image](https://github.com/arsalan77x/se_lab_8/assets/63359673/06cbdbe7-c94e-409c-b9b9-ba14de28ed3c)

## پرسش ها
1.

کد تمیز: کد تمیز کدی است که خواندن، درک و نگهداری آن آسان است. کد تمیز توسعه نرم افزار را قابل پیش بینی می کند و کیفیت محصول حاصل را افزایش می دهد. کد تمیز این ویژگی ها را دارد: 1) برای برنامه نویسان دیگر واضح است. 2) حاوی تکرار نیست. 3) دارای حداقل تعداد کلاس ها و سایر قطعات متحرک است. 4) تمام تست ها را با موفقیت پشت سر می گذارد. 5) نگهداری آن آسان تر و ارزان تر است!

بدهی فنی: شبیه گرفتن وام است: فوراً مزایایی دریافت می کنید، اما باید آن را با بهره بازپرداخت کنید. همین اتفاق ممکن است با کد هم بیفتد. می توانید با استفاده از میانبرها یا راه حل های غیربهینه و بدون نوشتن تست برای ویژگی های جدید، به طور موقت سرعت پروژه خود را افزایش دهید، اما این کار به تدریج پیشرفت شما را هر روز کند می کند تا اینکه در نهایت با نوشتن تست ها، بدهی خود را پرداخت کنید. 

بوی بد: بوهای کد نشانگر مشکلاتی هستند که می توان در طی بازسازی مجدد آنها را برطرف کرد. بوهای کد به راحتی قابل تشخیص و رفع هستند، اما ممکن است علائم یک مشکل عمیق تر با کد باشند.

2.
بوهای کد را می توان به این 5 کلاس طبقه بندی کرد:

1) Bloaters: Bloaters کدها، روش‌ها و کلاس‌هایی هستند که به اندازه‌های عظیمی افزایش یافته‌اند که کار کردن با آنها سخت است. معمولاً این بوها فوراً ظاهر نمی شوند، بلکه در طول زمان و با تکامل برنامه جمع می شوند (و مخصوصاً وقتی کسی تلاشی برای از بین بردن آنها نمی کند).

2) سوء استفاده کنندگان شی گرا (Object-Orientation Abusers): همه این بوها به کارگیری ناقص یا نادرست اصول برنامه نویسی شی گرا هستند.

3) جلوگیری کننده های تغییر(Change Preventers): این بوها به این معنی است که اگر نیاز به تغییر چیزی در یک مکان از کد خود دارید، باید در جاهای دیگر نیز تغییرات زیادی ایجاد کنید. در نتیجه توسعه برنامه بسیار پیچیده تر و گران تر می شود.

4) غیر قابل استفاده(Dispensables): یک چیز بیهوده و غیر ضروری است که نبود آن کد را تمیزتر، کارآمدتر و قابل درک تر می کند.

5) کوپلرها(Couplers): تمام بوهای موجود در این گروه به جفت شدن بیش از حد بین کلاس ها کمک می کند یا نشان می دهد که اگر جفت با تفویض بیش از حد جایگزین شود چه اتفاقی می افتد. 


3.
کد تنبل متعلق به کدام دسته است؟ کد تنبل متعلق به دسته Dispensables است. 

علائم و نشانه‌ها شامل زمانی است که درک و نگهداری کلاس‌ها همیشه هزینه و زمان دارد. بنابراین اگر یک کلاس به اندازه کافی برای جلب توجه شما انجام نمی دهد، باید حذف شود. همچنین، دلایل این مشکل این است که شاید کلاسی طراحی شده است که کاملاً کاربردی باشد، اما پس از برخی از بازسازی‌ها به طرز مضحکی کوچک شده است یا شاید برای پشتیبانی از کارهای توسعه آینده طراحی شده است که هرگز انجام نشد. حال برای برطرف کردن این مشکل، استفاده از کدام بازآرایی ها پیشنهاد می شود؟ 1) اجزایی که تقریباً بی استفاده هستند باید از درمان کلاس Inline استفاده کنند. 2) برای زیر کلاس هایی با توابع کم، Collapse Hierarchy را امتحان کنید. 

چه زمانی می توانیم کد تنبل را نادیده بگیریم؟ گاهی اوقات یک کلاس تنبل به منظور ترسیم اهداف توسعه آینده ایجاد می شود، در این مورد، سعی کنید تعادلی بین وضوح و سادگی در کد خود حفظ کنید. 

4.
بوی بدهای زیادی وجود دارد که برای هر کدام، در جاهای مختلفی این ایراد پیدا شده اما ما برای هر کدام، به یک مورد اشاره می کنیم.

مورد اول) Large Class

مشکل: کلاس Main (در Main.java) دارای مسئولیت های بسیار زیادی است مثل راه اندازی اولیه رابط کاربری گرافیکی، تولید XML، پردازش نمودار. پیشنهاد: کلاس اصلی را به چند کلاس کوچکتر تقسیم کنید که هر کدام مسئولیت خاصی را بر عهده دارند. به عنوان مثال، کلاس های جداگانه ای برای مدیریت رابط کاربری گرافیکی، پردازش XML و عملیات نمودار ایجاد کنید.

مورد دوم) Long Method

مشکل: برخی از روش ها مانند روش main و متد initializeGUI  (در (Main.java بیش از حد طولانی هستند و چندین کار را انجام می دهند و خواندن و نگهداری آنها را سخت می کند. پیشنهاد: روش های طولانی را به روش های کوچکتر و متمرکزتر تقسیم کنید. به عنوان مثال، روش اصلی را برای تفویض وظایف مختلف به روش‌های مجزا تغییر دهید.

مورد سوم) Duplicate Code

مشکل: بلوک‌های کد مکرر که عملیات مشابهی را انجام می‌دهند در متدهای generateInfoForXML و loopOnGUI (در Main.java ) مشاهده می‌شوند. هر دوی این روش ها بلوک های مشابهی برای رسیدگی به وضعیت نمودارها و نتایج چاپ دارند. پیشنهاد: کدهای رایج را به روش‌های کمکی استخراج کنید که می‌توانند در هر دو مکان دوباره استفاده شوند.

مورد چهارم) Feature Envy

مشکل: روش‌هایی که بیشتر به کلاسی غیر از کلاسی که در آن هستند علاقه‌مند هستند، در متد  loopOnGUI(در Main.java ) مشاهده می‌شوند، زیرا منطق زیادی برای تعامل با guiDiagram دارد. پیشنهاد: منطق مربوطه را به کلاس GUIDiagram منتقل کنید، بنابراین کلاس Main نیازی به رسیدگی مستقیم به این جزئیات ندارد.

مورد پنجم) Excessive Use of Static Fields

مشکل: ما شاهد استفاده بیش از حد از فیلدهای استاتیک هستیم که می‌تواند منجر به مشکلات مدیریت و آزمایش در بسیاری از مکان‌ها (در Main.java) هستیم مانند:
static public DocumentBuilderFactory documentFactory;

static public DocumentBuilder documentBuilder;

static public Document document;

static private JFrame frame;

static public Transformer transformer;

static public GUIDiagram guiDiagram;

static private int counter = 0;
پیشنهاد: در صورت امکان از فیلدهای نمونه به جای فیلدهای ثابت استفاده کنید. برای مدیریت منابع مشترک مانند DocumentBuilderFactory  و Transformer، تزریق وابستگی را در نظر بگیرید.

مورد ششم) Comments

مشکل: ما کامنت های کاملا غیر ضروری را در خطوط 62 تا 64 (درMain.java)  می بینیم. کامنت غیر ضروری خوانایی کد را کاهش می دهد و می تواند برای توسعه دهندگان دیگر گیج کننده باشد. همچنین، آنها در طول زمان انباشته می شوند و پایگاه کد را به هم می ریزند. پیشنهاد: در صورت عدم نیاز، کدهای کامنت را حذف کنید. اگر کد ممکن است بعدا مفید باشد، به جای گذاشتن کدهای کامنت در پایگاه کد، از سیستم های کنترل نسخه (مانند Git ) برای پیگیری چنین تغییراتی استفاده کنید.

مورد هفتم) PrimitiveObsession

مشکل: ما استفاده از انواع و مجموعه های اولیه را مستقیماً به جای انواع خاص دامنه ) در DescriptiveMember.java ) به طور خاص در موارد زیر مشاهده می کنیم: 1) String برای توضیحات و وضعیت ها 2) Vector برای لیست مشکلات و پارامترها 3) در تابع getAllProblemsOfVector ما Vector<Pair<BasicDiagramStatus, LinkedList<String>>> 
پیشنهاد: برای بهبود ایمنی نوع و خوانایی، مجموعه‌های اولیه و مجموعه‌ها را در کلاس‌های دامنه خاص کپسوله کنید.

مورد هشتم) MessageChain

مشکل: می دانیم که ممکن است پس از ادغام چندین نوع الگوریتم در یک روش، فهرست طولانی از پارامترها رخ دهد. ممکن است یک لیست طولانی برای کنترل الگوریتم و نحوه اجرا ایجاد شده باشد. می بینیم که دقیقاً همان اتفاقی می افتد که می بینیم چهار پارامتر مختلف به تابع addToTable  (در MethodOverloader.java ) ارسال می شود. در اینجا، پارامتر className فقط در صورت خالی بودن به عنوان پارامتر ValueType استفاده می شود و همچنین، mangledName  فقط در داخل RealFunction استفاده می شود، اما می بینیم که همه اینها به addToTable ارسال می شود.

مورد نهم) Lazy Function

مشکل: می بینیم که یک تابع generateSelectArg وجود دارد که فقط یک رشته ساده را به یک عدد صحیح ( در MethodOverloader.java )  الحاق می کند که فقط انتزاع غیر ضروری را اضافه می کند. پیشنهاد: برای رفع این مشکل، می‌توانید متد generateSelectArg را در هر جایی که فراخوانی می‌شود، درون خط قرار دهید و آن را به طور کلی حذف کنید، کد را ساده کرده و نیازی به فراخوانی متد اضافی را از بین ببرید. این خوانایی کد را بهبود می بخشد و انتزاع غیر ضروری را کاهش می دهد. پیشنهاد دیگر این است که اگر مشاهده کردید که لیستی از توابع ابزار مورد نیاز شما وجود دارد، generateSelectArg  را به آن کلاس (یعنی utils.java مثلا) منتقل کنید.

مورد دهم) Switch Statements

مشکل: در داخل تابع main  (در Main.java)، یک دستور سوئیچ طولانی می بینیم که args[i] را بررسی می کند. پیشنهاد: به جای آن باید به چندشکلی فکر کنید. برای ایزوله کردن سوئیچ و قرار دادن آن در کلاس مناسب، ممکن است به Extract Method و سپس Move Method نیاز داشته باشید، یعنی می توانید منطق پیکربندی دایرکتوری را در یک متد یا کلاس جداگانه کپسوله کنید.

مورد یازدهم) Data Clump

مشکل: ما پارامترهایی را می بینیم که با هم ارسال می شوند اما بهتر است آنها را به عنوان یکی ترکیب کنیم. پارامترهای name String، TType returnValueType، Vector<T> params را می بینیم. پیشنهاد: برای کاهش تکرار و بهبود انسجام، این پارامترها را در یک کلاس محصور کنید.

مورد دوازدهم) Long parameter list

مشکل: می دانیم که ممکن است پس از ادغام چندین نوع الگوریتم در یک روش، فهرست طولانی از پارامترها رخ دهد. ممکن است یک لیست طولانی برای کنترل الگوریتم و نحوه اجرا ایجاد شده باشد. می بینیم که دقیقاً همان اتفاقی می افتد که می بینیم چهار پارامتر مختلف به تابع addToTable  ( در MethodOverloader.java ) ارسال می شود. در اینجا، پارامتر className فقط در صورت خالی بودن به عنوان پارامتر ValueType استفاده می شود و همچنین،mangledName  فقط در داخل RealFunction استفاده می شود، اما می بینیم که همه اینها به addToTable ارسال می شود.


5.
این پلاگین (افزونه) چه کار می کند؟ کاری که افزونه Formatter Maven انجام می دهد این است که کد منبع جاوا را با استفاده از فرمت کننده کد Eclipse قالب بندی می کند. 

چگونه کمک کننده است؟ از این جهت مفید است که به حفظ یک سبک کد ثابت در سراسر پروژه کمک می کند، که می تواند خوانایی و قابلیت نگهداری را افزایش دهد.

چه ارتباطی با refactoring دارد؟ برای refactoring، این ابزار در refactoring کد مفید است زیرا فرآیند اعمال یک سبک کدنویسی ثابت را خودکار می‌کند و به توسعه‌دهندگان اجازه می‌دهد بدون نگرانی در مورد جزئیات قالب‌بندی، بر بهبود ساختار و طراحی کد تمرکز کنند.



</div>
