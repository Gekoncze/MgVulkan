package cz.mg.vulkan;

public class VkIndirectCommandsLayoutTokenNVX extends VkObject {
    public VkIndirectCommandsLayoutTokenNVX() {
        super(sizeof());
    }

    protected VkIndirectCommandsLayoutTokenNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkIndirectCommandsLayoutTokenNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkIndirectCommandsLayoutTokenNVX(VkPointer pointer) {
        super(pointer);
    }



    public VkIndirectCommandsTokenTypeNVX getTokenType() {
        return new VkIndirectCommandsTokenTypeNVX(getVkMemory(), getTokenTypeNative(getVkAddress()));
    }

    
    public void setTokenType(VkIndirectCommandsTokenTypeNVX tokenType) {
        setTokenTypeNative(getVkAddress(), tokenType != null ? tokenType.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getTokenTypeQ() {
        return getTokenType().getValue();
    }

    public void setTokenType(int tokenType) {
        getTokenType().setValue(tokenType);
    }

    protected static native long getTokenTypeNative(long address);
    protected static native void setTokenTypeNative(long address, long tokenType);

    public VkUInt32 getBindingUnit() {
        return new VkUInt32(getVkMemory(), getBindingUnitNative(getVkAddress()));
    }

    
    public void setBindingUnit(VkUInt32 bindingUnit) {
        setBindingUnitNative(getVkAddress(), bindingUnit != null ? bindingUnit.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getBindingUnitQ() {
        return getBindingUnit().getValue();
    }

    public void setBindingUnit(int bindingUnit) {
        getBindingUnit().setValue(bindingUnit);
    }

    protected static native long getBindingUnitNative(long address);
    protected static native void setBindingUnitNative(long address, long bindingUnit);

    public VkUInt32 getDynamicCount() {
        return new VkUInt32(getVkMemory(), getDynamicCountNative(getVkAddress()));
    }

    
    public void setDynamicCount(VkUInt32 dynamicCount) {
        setDynamicCountNative(getVkAddress(), dynamicCount != null ? dynamicCount.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDynamicCountQ() {
        return getDynamicCount().getValue();
    }

    public void setDynamicCount(int dynamicCount) {
        getDynamicCount().setValue(dynamicCount);
    }

    protected static native long getDynamicCountNative(long address);
    protected static native void setDynamicCountNative(long address, long dynamicCount);

    public VkUInt32 getDivisor() {
        return new VkUInt32(getVkMemory(), getDivisorNative(getVkAddress()));
    }

    
    public void setDivisor(VkUInt32 divisor) {
        setDivisorNative(getVkAddress(), divisor != null ? divisor.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getDivisorQ() {
        return getDivisor().getValue();
    }

    public void setDivisor(int divisor) {
        getDivisor().setValue(divisor);
    }

    protected static native long getDivisorNative(long address);
    protected static native void setDivisorNative(long address, long divisor);


    public static native long sizeof();

    public static class Array extends VkIndirectCommandsLayoutTokenNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutTokenNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutTokenNVX.sizeof()));
            this.count = count;
        }

        public Array(VkIndirectCommandsLayoutTokenNVX o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkIndirectCommandsLayoutTokenNVX get(int i){
            return new VkIndirectCommandsLayoutTokenNVX(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
