public enum SchoolSubjects {
                MATH(true),
                ENGLISH(false),
                BIOLOGY(true),
                SPANISH(false),
                TENNIS(false),
                ROBOTICS(false);

                private boolean isExamable;

                SchoolSubjects(boolean isExamable) {
                        this.isExamable = isExamable;
                }

                public String getisExamable(){
                        return toString();
                }

    @Override
    public String toString() {
                    if(isExamable){
                        return "There is a test";
                    }
                    else{
                        return "No test";
                    }

    }
}



