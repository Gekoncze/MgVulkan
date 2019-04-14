package cz.mg.vulkan;

public class VkRenderPassBeginInfo extends VkObject {
    public VkRenderPassBeginInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO));
    }

    public VkRenderPassBeginInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkRenderPassBeginInfo(VkMemory vkmemory, long vkaddress) {
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

    public VkRenderPass getRenderPass() {
        return new VkRenderPass(getVkMemory(), getRenderPass(getVkAddress()));
    }

    
    public void setRenderPass(VkRenderPass renderPass) {
        setRenderPass(getVkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRenderPass(long address);
    private static native void setRenderPass(long address, long renderPass);

    public VkFramebuffer getFramebuffer() {
        return new VkFramebuffer(getVkMemory(), getFramebuffer(getVkAddress()));
    }

    
    public void setFramebuffer(VkFramebuffer framebuffer) {
        setFramebuffer(getVkAddress(), framebuffer != null ? framebuffer.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFramebuffer(long address);
    private static native void setFramebuffer(long address, long framebuffer);

    public VkRect2D getRenderArea() {
        return new VkRect2D(getVkMemory(), getRenderArea(getVkAddress()));
    }

    
    public void setRenderArea(VkRect2D renderArea) {
        setRenderArea(getVkAddress(), renderArea != null ? renderArea.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getRenderArea(long address);
    private static native void setRenderArea(long address, long renderArea);

    public VkUInt32 getClearValueCount() {
        return new VkUInt32(getVkMemory(), getClearValueCount(getVkAddress()));
    }

    
    public void setClearValueCount(VkUInt32 clearValueCount) {
        setClearValueCount(getVkAddress(), clearValueCount != null ? clearValueCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getClearValueCount(long address);
    private static native void setClearValueCount(long address, long clearValueCount);

    public VkClearValue getPClearValues() {
        return new VkClearValue(getVkMemory(), getPClearValues(getVkAddress()));
    }

    private VkObject pClearValues = null;
    public void setPClearValues(VkClearValue pClearValues) {
        setPClearValues(getVkAddress(), pClearValues != null ? pClearValues.getVkAddress() : VkPointer.NULL);
        this.pClearValues = pClearValues;
    }

    private static native long getPClearValues(long address);
    private static native void setPClearValues(long address, long pClearValues);


    public static native long sizeof();

    public static class Array extends VkRenderPassBeginInfo implements cz.mg.collections.array.ReadonlyArray<VkRenderPassBeginInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkRenderPassBeginInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkRenderPassBeginInfo o){
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
        public VkRenderPassBeginInfo get(int i){
            return new VkRenderPassBeginInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkRenderPassBeginInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkRenderPassBeginInfo.Pointer> {
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

            public Array(VkRenderPassBeginInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkRenderPassBeginInfo.Pointer get(int i){
                return new VkRenderPassBeginInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
