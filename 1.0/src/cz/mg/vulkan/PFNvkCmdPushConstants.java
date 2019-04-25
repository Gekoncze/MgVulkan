package cz.mg.vulkan;

public class PFNvkCmdPushConstants extends VkFunctionPointer {
    public PFNvkCmdPushConstants() {
    }

    public PFNvkCmdPushConstants(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdPushConstants(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPushConstants(long value) {
        setValue(value);
    }

    public PFNvkCmdPushConstants(VkInstance instance) {
        super(instance, new VkString("vkCmdPushConstants"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineLayout layout, VkShaderStageFlags stageFlags, VkUInt32 offset, VkUInt32 size, VkObject pValues){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), stageFlags != null ? stageFlags.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), pValues != null ? pValues.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long layout, long stageFlags, long offset, long size, long pValues);
}
