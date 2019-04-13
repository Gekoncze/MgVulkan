package cz.mg.vulkan;

public class VkSubpassDependency extends VkObject {
    public VkSubpassDependency() {
        super(sizeof());
    }

    public VkSubpassDependency(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSubpassDependency(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSubpassDependency(VkUInt32 srcSubpass, VkUInt32 dstSubpass, VkPipelineStageFlags srcStageMask, VkPipelineStageFlags dstStageMask, VkAccessFlags srcAccessMask, VkAccessFlags dstAccessMask, VkDependencyFlags dependencyFlags) {
        super(sizeof());
        setSrcSubpass(srcSubpass);
        setDstSubpass(dstSubpass);
        setSrcStageMask(srcStageMask);
        setDstStageMask(dstStageMask);
        setSrcAccessMask(srcAccessMask);
        setDstAccessMask(dstAccessMask);
        setDependencyFlags(dependencyFlags);
    }

    public VkUInt32 getSrcSubpass() {
        return new VkUInt32(getVkMemory(), getSrcSubpass(getVkAddress()));
    }

    
    public void setSrcSubpass(VkUInt32 srcSubpass) {
        setSrcSubpass(getVkAddress(), srcSubpass != null ? srcSubpass.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcSubpass(long address);
    private static native void setSrcSubpass(long address, long srcSubpass);

    public VkUInt32 getDstSubpass() {
        return new VkUInt32(getVkMemory(), getDstSubpass(getVkAddress()));
    }

    
    public void setDstSubpass(VkUInt32 dstSubpass) {
        setDstSubpass(getVkAddress(), dstSubpass != null ? dstSubpass.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstSubpass(long address);
    private static native void setDstSubpass(long address, long dstSubpass);

    public VkPipelineStageFlags getSrcStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getSrcStageMask(getVkAddress()));
    }

    
    public void setSrcStageMask(VkPipelineStageFlags srcStageMask) {
        setSrcStageMask(getVkAddress(), srcStageMask != null ? srcStageMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcStageMask(long address);
    private static native void setSrcStageMask(long address, long srcStageMask);

    public VkPipelineStageFlags getDstStageMask() {
        return new VkPipelineStageFlags(getVkMemory(), getDstStageMask(getVkAddress()));
    }

    
    public void setDstStageMask(VkPipelineStageFlags dstStageMask) {
        setDstStageMask(getVkAddress(), dstStageMask != null ? dstStageMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstStageMask(long address);
    private static native void setDstStageMask(long address, long dstStageMask);

    public VkAccessFlags getSrcAccessMask() {
        return new VkAccessFlags(getVkMemory(), getSrcAccessMask(getVkAddress()));
    }

    
    public void setSrcAccessMask(VkAccessFlags srcAccessMask) {
        setSrcAccessMask(getVkAddress(), srcAccessMask != null ? srcAccessMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getSrcAccessMask(long address);
    private static native void setSrcAccessMask(long address, long srcAccessMask);

    public VkAccessFlags getDstAccessMask() {
        return new VkAccessFlags(getVkMemory(), getDstAccessMask(getVkAddress()));
    }

    
    public void setDstAccessMask(VkAccessFlags dstAccessMask) {
        setDstAccessMask(getVkAddress(), dstAccessMask != null ? dstAccessMask.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDstAccessMask(long address);
    private static native void setDstAccessMask(long address, long dstAccessMask);

    public VkDependencyFlags getDependencyFlags() {
        return new VkDependencyFlags(getVkMemory(), getDependencyFlags(getVkAddress()));
    }

    
    public void setDependencyFlags(VkDependencyFlags dependencyFlags) {
        setDependencyFlags(getVkAddress(), dependencyFlags != null ? dependencyFlags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getDependencyFlags(long address);
    private static native void setDependencyFlags(long address, long dependencyFlags);


    public static native long sizeof();

    public static class Array extends VkSubpassDependency implements cz.mg.collections.array.ReadonlyArray<VkSubpassDependency> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkSubpassDependency.sizeof()));
            this.count = count;
        }

        public Array(int count, VkSubpassDependency o){
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
        public VkSubpassDependency get(int i){
            return new VkSubpassDependency(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkSubpassDependency.Pointer implements cz.mg.collections.array.ReadonlyArray<VkSubpassDependency.Pointer> {
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

            public Array(VkSubpassDependency[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkSubpassDependency.Pointer get(int i){
                return new VkSubpassDependency.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
