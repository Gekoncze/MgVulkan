package cz.mg.vulkan;

public class VkPipelineRasterizationStateRasterizationOrderAMD extends VkObject {
    public VkPipelineRasterizationStateRasterizationOrderAMD() {
        super(sizeof());
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineRasterizationStateRasterizationOrderAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddressNative());
        
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

    public VkRasterizationOrderAMD getRasterizationOrder() {
        return new VkRasterizationOrderAMD(getVkMemory(), getRasterizationOrder(getVkAddress()));
    }

    
    public void setRasterizationOrder(VkRasterizationOrderAMD rasterizationOrder) {
        setRasterizationOrder(getVkAddress(), rasterizationOrder != null ? rasterizationOrder.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getRasterizationOrderQ() {
        return getRasterizationOrder().getValue();
    }

    public void setRasterizationOrder(int rasterizationOrder) {
        getRasterizationOrder().setValue(rasterizationOrder);
    }

    protected static native long getRasterizationOrder(long address);
    protected static native void setRasterizationOrder(long address, long rasterizationOrder);


    public static native long sizeof();

    public static class Array extends VkPipelineRasterizationStateRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateRasterizationOrderAMD> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineRasterizationStateRasterizationOrderAMD.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineRasterizationStateRasterizationOrderAMD o){
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
        public VkPipelineRasterizationStateRasterizationOrderAMD get(int i){
            return new VkPipelineRasterizationStateRasterizationOrderAMD(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
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

        public static class Array extends VkPipelineRasterizationStateRasterizationOrderAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPipelineRasterizationStateRasterizationOrderAMD.Pointer> {
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

            public Array(VkPipelineRasterizationStateRasterizationOrderAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            public Array(long... values){
                this(values.length);
                for(int i = 0; i < values.length; i++) setValueAt(i, values[i]);
            }

            public long getValueAt(int i){
                return getValueNative(addressAt(i));
            }

            public void setValueAt(int i, long value){
                setValueNative(addressAt(i), value);
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPipelineRasterizationStateRasterizationOrderAMD.Pointer get(int i){
                return new VkPipelineRasterizationStateRasterizationOrderAMD.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }

            protected long addressAt(int i){
                return VkPointer.plus(getVkAddress(), sizeof()*i);
            }
        }
    }
}
