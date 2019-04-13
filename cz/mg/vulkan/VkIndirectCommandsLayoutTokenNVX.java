package cz.mg.vulkan;

public class VkIndirectCommandsLayoutTokenNVX extends VkObject {
    public VkIndirectCommandsLayoutTokenNVX() {
        super(sizeof());
    }

    public VkIndirectCommandsLayoutTokenNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutTokenNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkIndirectCommandsLayoutTokenNVX(VkIndirectCommandsTokenTypeNVX tokenType, VkUInt32 bindingUnit, VkUInt32 dynamicCount, VkUInt32 divisor) {
        super(sizeof());
        setTokenType(tokenType);
        setBindingUnit(bindingUnit);
        setDynamicCount(dynamicCount);
        setDivisor(divisor);
    }

    public VkIndirectCommandsTokenTypeNVX getTokenType() {
        return new VkIndirectCommandsTokenTypeNVX(getVkMemory(), getTokenType(getVkAddress()));
    }

    
    public void setTokenType(VkIndirectCommandsTokenTypeNVX tokenType) {
        setTokenType(getVkAddress(), tokenType != null ? tokenType.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getTokenType(long address);
    private static native void setTokenType(long address, long tokenType);

    public VkUInt32 getBindingUnit() {
        return new VkUInt32(getVkMemory(), getBindingUnit(getVkAddress()));
    }

    
    public void setBindingUnit(VkUInt32 bindingUnit) {
        setBindingUnit(getVkAddress(), bindingUnit != null ? bindingUnit.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getBindingUnit(long address);
    private static native void setBindingUnit(long address, long bindingUnit);

    public VkUInt32 getDynamicCount() {
        return new VkUInt32(getVkMemory(), getDynamicCount(getVkAddress()));
    }

    
    public void setDynamicCount(VkUInt32 dynamicCount) {
        setDynamicCount(getVkAddress(), dynamicCount != null ? dynamicCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDynamicCount(long address);
    private static native void setDynamicCount(long address, long dynamicCount);

    public VkUInt32 getDivisor() {
        return new VkUInt32(getVkMemory(), getDivisor(getVkAddress()));
    }

    
    public void setDivisor(VkUInt32 divisor) {
        setDivisor(getVkAddress(), divisor != null ? divisor.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDivisor(long address);
    private static native void setDivisor(long address, long divisor);


    public static native long sizeof();

    public static class Array extends VkIndirectCommandsLayoutTokenNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutTokenNVX> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutTokenNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsLayoutTokenNVX o){
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
        public VkIndirectCommandsLayoutTokenNVX get(int i){
            return new VkIndirectCommandsLayoutTokenNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkIndirectCommandsLayoutTokenNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutTokenNVX.Pointer> {
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

            public Array(VkIndirectCommandsLayoutTokenNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkIndirectCommandsLayoutTokenNVX.Pointer get(int i){
                return new VkIndirectCommandsLayoutTokenNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
