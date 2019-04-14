package cz.mg.vulkan;

public class VkExportFenceCreateInfo extends VkObject {
    public VkExportFenceCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO));
    }

    public VkExportFenceCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExportFenceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkExternalFenceHandleTypeFlags getHandleTypes() {
        return new VkExternalFenceHandleTypeFlags(getVkMemory(), getHandleTypes(getVkAddress()));
    }

    
    public void setHandleTypes(VkExternalFenceHandleTypeFlags handleTypes) {
        setHandleTypes(getVkAddress(), handleTypes != null ? handleTypes.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public void setHandleTypes(int handleTypes) {
        getHandleTypes().setValue(handleTypes);
    }

    private static native long getHandleTypes(long address);
    private static native void setHandleTypes(long address, long handleTypes);


    public static native long sizeof();

    public static class Array extends VkExportFenceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkExportFenceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkExportFenceCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkExportFenceCreateInfo o){
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
        public VkExportFenceCreateInfo get(int i){
            return new VkExportFenceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkExportFenceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkExportFenceCreateInfo.Pointer> {
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

            public Array(VkExportFenceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkExportFenceCreateInfo.Pointer get(int i){
                return new VkExportFenceCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
