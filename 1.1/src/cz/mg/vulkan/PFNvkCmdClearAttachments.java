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

    public void call(VkCommandBuffer commandBuffer, VkUInt32 attachmentCount, VkClearAttachment pAttachments, VkUInt32 rectCount, VkClearRect pRects){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.getNullAddressNative(), pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL, rectCount != null ? rectCount.getVkAddress() : VkPointer.getNullAddressNative(), pRects != null ? pRects.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long attachmentCount, long pAttachments, long rectCount, long pRects);
}
