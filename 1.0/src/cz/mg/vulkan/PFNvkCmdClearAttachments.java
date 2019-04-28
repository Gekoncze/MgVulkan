package cz.mg.vulkan;

public class PFNvkCmdClearAttachments extends VkFunctionPointer {
    public PFNvkCmdClearAttachments() {
    }

    protected PFNvkCmdClearAttachments(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdClearAttachments(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdClearAttachments(long value) {
        setValue(value);
    }

    public PFNvkCmdClearAttachments(VkInstance instance) {
        super(instance, new VkString("vkCmdClearAttachments"));
    }

    public void call(VkCommandBuffer commandBuffer, int attachmentCount, VkClearAttachment pAttachments, int rectCount, VkClearRect pRects){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), attachmentCount, pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL, rectCount, pRects != null ? pRects.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, int attachmentCount, long pAttachments, int rectCount, long pRects);

}
