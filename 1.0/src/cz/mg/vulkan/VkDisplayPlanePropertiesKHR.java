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
        setCurrentDisplay(getVkAddress(), currentDisplay != null ? currentDisplay.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    protected static native long getCurrentDisplay(long address);
    protected static native void setCurrentDisplay(long address, long currentDisplay);

    public VkUInt32 getCurrentStackIndex() {
        return new VkUInt32(getVkMemory(), getCurrentStackIndex(getVkAddress()));
    }

    
    public void setCurrentStackIndex(VkUInt32 currentStackIndex) {
        setCurrentStackIndex(getVkAddress(), currentStackIndex != null ? currentStackIndex.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getCurrentStackIndexQ() {
        return getCurrentStackIndex().getValue();
    }

    public void setCurrentStackIndex(int currentStackIndex) {
        getCurrentStackIndex().setValue(currentStackIndex);
    }

    protected static native long getCurrentStackIndex(long address);
    protected static native void setCurrentStackIndex(long address, long currentStackIndex);


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
            return new VkDisplayPlanePropertiesKHR(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            public Array2(int count, VkPointer o){
                super(count, o);
            }

            public Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            public Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
