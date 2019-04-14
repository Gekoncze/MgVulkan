package cz.mg.vulkan;

public class VkDisplayModePropertiesKHR extends VkObject {
    public VkDisplayModePropertiesKHR() {
        super(sizeof());
    }

    public VkDisplayModePropertiesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDisplayModePropertiesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkDisplayModeKHR getDisplayMode() {
        return new VkDisplayModeKHR(getVkMemory(), getDisplayMode(getVkAddress()));
    }

    
    public void setDisplayMode(VkDisplayModeKHR displayMode) {
        setDisplayMode(getVkAddress(), displayMode != null ? displayMode.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDisplayMode(long address);
    private static native void setDisplayMode(long address, long displayMode);

    public VkDisplayModeParametersKHR getParameters() {
        return new VkDisplayModeParametersKHR(getVkMemory(), getParameters(getVkAddress()));
    }

    
    public void setParameters(VkDisplayModeParametersKHR parameters) {
        setParameters(getVkAddress(), parameters != null ? parameters.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getParameters(long address);
    private static native void setParameters(long address, long parameters);


    public static native long sizeof();

    public static class Array extends VkDisplayModePropertiesKHR implements cz.mg.collections.array.ReadonlyArray<VkDisplayModePropertiesKHR> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDisplayModePropertiesKHR.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDisplayModePropertiesKHR o){
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
        public VkDisplayModePropertiesKHR get(int i){
            return new VkDisplayModePropertiesKHR(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDisplayModePropertiesKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDisplayModePropertiesKHR.Pointer> {
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

            public Array(VkDisplayModePropertiesKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDisplayModePropertiesKHR.Pointer get(int i){
                return new VkDisplayModePropertiesKHR.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
