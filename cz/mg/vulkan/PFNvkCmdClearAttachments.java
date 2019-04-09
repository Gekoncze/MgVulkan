package cz.mg.vulkan;

public class PFNvkCmdClearAttachments extends VkFunctionPointer {
    public PFNvkCmdClearAttachments() {
    }

    public PFNvkCmdClearAttachments(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdClearAttachments(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdClearAttachments(long value) {
        setValue(value);
    }

    public PFNvkCmdClearAttachments(VkInstance instance) {
        super(instance, new VkString("vkCmdClearAttachments"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 attachmentCount, VkClearAttachment pAttachments, VkUInt32 rectCount, VkClearRect pRects){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, attachmentCount != null ? attachmentCount.getVkAddress() : VkPointer.NULL_ADDRESS, pAttachments != null ? pAttachments.getVkAddress() : VkPointer.NULL, rectCount != null ? rectCount.getVkAddress() : VkPointer.NULL_ADDRESS, pRects != null ? pRects.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long attachmentCount, long pAttachments, long rectCount, long pRects);
}
