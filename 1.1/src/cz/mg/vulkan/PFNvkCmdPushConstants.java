package cz.mg.vulkan;

public class PFNvkCmdPushConstants extends VkFunctionPointer {
    public PFNvkCmdPushConstants() {
    }

    protected PFNvkCmdPushConstants(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdPushConstants(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdPushConstants(long value) {
        setValue(value);
    }

    public PFNvkCmdPushConstants(VkInstance instance) {
        super(instance, new VkString("vkCmdPushConstants"));
    }

    public void call(VkCommandBuffer commandBuffer, VkPipelineLayout layout, int stageFlags, int offset, int size, VkObject pValues){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), layout != null ? layout.getVkAddress() : VkPointer.getNullAddressNative(), stageFlags, offset, size, pValues != null ? pValues.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long layout, int stageFlags, int offset, int size, long pValues);

}
