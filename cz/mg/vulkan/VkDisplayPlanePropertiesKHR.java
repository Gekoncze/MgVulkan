package cz.mg.vulkan;

public class VkDisplayPlanePropertiesKHR extends VkObject {
    public VkDisplayPlanePropertiesKHR() {
        super(sizeof());
    }

    public VkDisplayPlanePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayPlanePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDisplayKHR getCurrentDisplay() {
        return new VkDisplayKHR(getVkMemory(), getCurrentDisplay(getVkAddress()));
    }

    
    public void setCurrentDisplay(VkDisplayKHR currentDisplay) {
        setCurrentDisplay(getVkAddress(), currentDisplay != null ? currentDisplay.getVkAddress() : VkPointer.getNullAddress());
        
    }

    private static native long getCurrentDisplay(long address);
    private static native void setCurrentDisplay(long address, long currentDisplay);

    public VkUInt32 getCurrentStackIndex() {
        return new VkUInt32(getVkMemory(), getCurrentStackIndex(getVkAddress()));
    }

    
    public void setCurrentStackIndex(VkUInt32 currentStackIndex) {
        setCurrentStackIndex(getVkAddress(), currentStackIndex != null ? currentStackIndex.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setCurrentStackIndex(int currentStackIndex) {
        getCurrentStackIndex().setValue(currentStackIndex);
    }

    private static native long getCurrentStackIndex(long address);
    private static native void setCurrentStackIndex(long address, long currentStackIndex);


    public static native long sizeof();

    public static class Array extends VkDisplayPlanePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlanePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayPlanePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayPlanePropertiesKHR o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkDisplayPlanePropertiesKHR get(int i){
            return new VkDisplayPlanePropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkDisplayPlanePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayPlanePropertiesKHR.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
                this.count = count;
            }

            public Array(VkMemory vkmemory, int count) {
                super(vkmemory);
                this.count = count;
            }

            public Array(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress);
                this.count = count;
            }

            public Array(VkDisplayPlanePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayPlanePropertiesKHR.Pointer get(int i){
                return new VkDisplayPlanePropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
