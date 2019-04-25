package cz.mg.vulkan;

public class VkProtectedSubmitInfo extends VkObject {
    public VkProtectedSubmitInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO));
    }

    public VkProtectedSubmitInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkProtectedSubmitInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
    }

    protected static native long getSType(long address);
    protected static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    protected static native long getPNext(long address);
    protected static native void setPNext(long address, long pNext);

    public VkBool32 getProtectedSubmit() {
        return new VkBool32(getVkMemory(), getProtectedSubmit(getVkAddress()));
    }

    
    public void setProtectedSubmit(VkBool32 protectedSubmit) {
        setProtectedSubmit(getVkAddress(), protectedSubmit != null ? protectedSubmit.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getProtectedSubmitQ() {
        return getProtectedSubmit().getValue();
    }

    public void setProtectedSubmit(int protectedSubmit) {
        getProtectedSubmit().setValue(protectedSubmit);
    }

    protected static native long getProtectedSubmit(long address);
    protected static native void setProtectedSubmit(long address, long protectedSubmit);


    public static native long sizeof();

    public static class Array extends VkProtectedSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VkProtectedSubmitInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkProtectedSubmitInfo.sizeof()));
            this.count = count;
            for(int i = 0; i < count; i++) get(i).setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO));;
        }

        public Array(int count, VkProtectedSubmitInfo o){
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
        public VkProtectedSubmitInfo get(int i){
            return new VkProtectedSubmitInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkProtectedSubmitInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkProtectedSubmitInfo.Pointer> {
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

            public Array(VkProtectedSubmitInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkProtectedSubmitInfo.Pointer get(int i){
                return new VkProtectedSubmitInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
