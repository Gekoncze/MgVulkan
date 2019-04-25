package cz.mg.vulkan;

public class PFNvkCmdProcessCommandsNVX extends VkFunctionPointer {
    public PFNvkCmdProcessCommandsNVX() {
    }

    protected PFNvkCmdProcessCommandsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdProcessCommandsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdProcessCommandsNVX(long value) {
        setValue(value);
    }

    public PFNvkCmdProcessCommandsNVX(VkInstance instance) {
        super(instance, new VkString("vkCmdProcessCommandsNVX"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCmdProcessCommandsInfoNVX pProcessCommandsInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pProcessCommandsInfo != null ? pProcessCommandsInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long pProcessCommandsInfo);
}
