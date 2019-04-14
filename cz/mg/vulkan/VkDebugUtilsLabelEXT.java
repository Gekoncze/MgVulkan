package cz.mg.vulkan;

public class VkDebugUtilsLabelEXT extends VkObject {
    public VkDebugUtilsLabelEXT() {
        super(sizeof());
    }

    public VkDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkChar getPLabelName() {
        return new VkChar(getVkMemory(), getPLabelName(getVkAddress()));
    }

    private VkObject pLabelName = null;
    public void setPLabelName(VkChar pLabelName) {
        setPLabelName(getVkAddress(), pLabelName != null ? pLabelName.getVkAddress() : VkPointer.NULL);
        this.pLabelName = pLabelName;
    }

    private static native long getPLabelName(long address);
    private static native void setPLabelName(long address, long pLabelName);

    public VkFloat getColor() {
        return new VkFloat(getVkMemory(), getColor(getVkAddress()));
    }

    
    public void setColor(VkFloat color) {
        setColor(getVkAddress(), color != null ? color.getVkAddress() : VkPointer.NULL);
        
    }

    private static native long getColor(long address);
    private static native void setColor(long address, long color);


    public static native long sizeof();

    public static class Array extends VkDebugUtilsLabelEXT implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsLabelEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDebugUtilsLabelEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDebugUtilsLabelEXT o){
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
        public VkDebugUtilsLabelEXT get(int i){
            return new VkDebugUtilsLabelEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDebugUtilsLabelEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDebugUtilsLabelEXT.Pointer> {
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

            public Array(VkDebugUtilsLabelEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDebugUtilsLabelEXT.Pointer get(int i){
                return new VkDebugUtilsLabelEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
