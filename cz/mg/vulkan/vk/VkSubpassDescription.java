package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDescription.html">khronos documentation</a>
 **/
public class VkSubpassDescription extends VkObject {
    public VkSubpassDescription() {
        super(sizeof());
    }

    public VkSubpassDescription(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkSubpassDescription(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkSubpassDescription(VkSubpassDescriptionFlags flags, VkPipelineBindPoint pipelineBindPoint, VkUInt32 inputAttachmentCount, VkAttachmentReference pInputAttachments, VkUInt32 colorAttachmentCount, VkAttachmentReference pColorAttachments, VkAttachmentReference pResolveAttachments, VkAttachmentReference pDepthStencilAttachment, VkUInt32 preserveAttachmentCount, VkUInt32 pPreserveAttachments) {
        super(sizeof());
        setFlags(flags);
        setPipelineBindPoint(pipelineBindPoint);
        setInputAttachmentCount(inputAttachmentCount);
        setPInputAttachments(pInputAttachments);
        setColorAttachmentCount(colorAttachmentCount);
        setPColorAttachments(pColorAttachments);
        setPResolveAttachments(pResolveAttachments);
        setPDepthStencilAttachment(pDepthStencilAttachment);
        setPreserveAttachmentCount(preserveAttachmentCount);
        setPPreserveAttachments(pPreserveAttachments);
    }

    public VkSubpassDescriptionFlags getFlags() {
        return new VkSubpassDescriptionFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkSubpassDescriptionFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkPipelineBindPoint getPipelineBindPoint() {
        return new VkPipelineBindPoint(getVkMemory(), getPipelineBindPoint(getVkAddress()));
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint) {
        setPipelineBindPoint(getVkAddress(), pipelineBindPoint.getVkAddress());
    }

    private static native long getPipelineBindPoint(long address);
    private static native void setPipelineBindPoint(long address, long pipelineBindPoint);

    public VkUInt32 getInputAttachmentCount() {
        return new VkUInt32(getVkMemory(), getInputAttachmentCount(getVkAddress()));
    }

    public void setInputAttachmentCount(VkUInt32 inputAttachmentCount) {
        setInputAttachmentCount(getVkAddress(), inputAttachmentCount.getVkAddress());
    }

    private static native long getInputAttachmentCount(long address);
    private static native void setInputAttachmentCount(long address, long inputAttachmentCount);

    public VkAttachmentReference.Array getPInputAttachments() {
        return new VkAttachmentReference.Array(getVkMemory(), getPInputAttachments(getVkAddress()), getInputAttachmentCount().getValue());
    }

    public void setPInputAttachments(VkAttachmentReference pInputAttachments) {
        setPInputAttachments(getVkAddress(), pInputAttachments.getVkAddress());
    }

    private static native long getPInputAttachments(long address);
    private static native void setPInputAttachments(long address, long pInputAttachments);

    public VkUInt32 getColorAttachmentCount() {
        return new VkUInt32(getVkMemory(), getColorAttachmentCount(getVkAddress()));
    }

    public void setColorAttachmentCount(VkUInt32 colorAttachmentCount) {
        setColorAttachmentCount(getVkAddress(), colorAttachmentCount.getVkAddress());
    }

    private static native long getColorAttachmentCount(long address);
    private static native void setColorAttachmentCount(long address, long colorAttachmentCount);

    public VkAttachmentReference.Array getPColorAttachments() {
        return new VkAttachmentReference.Array(getVkMemory(), getPColorAttachments(getVkAddress()), getColorAttachmentCount().getValue());
    }

    public void setPColorAttachments(VkAttachmentReference pColorAttachments) {
        setPColorAttachments(getVkAddress(), pColorAttachments.getVkAddress());
    }

    private static native long getPColorAttachments(long address);
    private static native void setPColorAttachments(long address, long pColorAttachments);

    public VkAttachmentReference getPResolveAttachments() {
        return new VkAttachmentReference(getVkMemory(), getPResolveAttachments(getVkAddress()));
    }

    public void setPResolveAttachments(VkAttachmentReference pResolveAttachments) {
        setPResolveAttachments(getVkAddress(), pResolveAttachments.getVkAddress());
    }

    private static native long getPResolveAttachments(long address);
    private static native void setPResolveAttachments(long address, long pResolveAttachments);

    public VkAttachmentReference getPDepthStencilAttachment() {
        return new VkAttachmentReference(getVkMemory(), getPDepthStencilAttachment(getVkAddress()));
    }

    public void setPDepthStencilAttachment(VkAttachmentReference pDepthStencilAttachment) {
        setPDepthStencilAttachment(getVkAddress(), pDepthStencilAttachment.getVkAddress());
    }

    private static native long getPDepthStencilAttachment(long address);
    private static native void setPDepthStencilAttachment(long address, long pDepthStencilAttachment);

    public VkUInt32 getPreserveAttachmentCount() {
        return new VkUInt32(getVkMemory(), getPreserveAttachmentCount(getVkAddress()));
    }

    public void setPreserveAttachmentCount(VkUInt32 preserveAttachmentCount) {
        setPreserveAttachmentCount(getVkAddress(), preserveAttachmentCount.getVkAddress());
    }

    private static native long getPreserveAttachmentCount(long address);
    private static native void setPreserveAttachmentCount(long address, long preserveAttachmentCount);

    public VkUInt32.Array getPPreserveAttachments() {
        return new VkUInt32.Array(getVkMemory(), getPPreserveAttachments(getVkAddress()), getPreserveAttachmentCount().getValue());
    }

    public void setPPreserveAttachments(VkUInt32 pPreserveAttachments) {
        setPPreserveAttachments(getVkAddress(), pPreserveAttachments.getVkAddress());
    }

    private static native long getPPreserveAttachments(long address);
    private static native void setPPreserveAttachments(long address, long pPreserveAttachments);


    public static native long sizeof();

    public static class Array extends VkSubpassDescription implements cz.mg.collections.array.ReadonlyArray<VkSubpassDescription> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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
        public VkSubpassDescription get(int i){
            return new VkSubpassDescription(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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

            public Array(VkSubpassDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
