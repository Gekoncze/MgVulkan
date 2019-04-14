package cz.mg.vulkan;

public class PFNvkCmdSetDeviceMask extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMask() {
    }

    public PFNvkCmdSetDeviceMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDeviceMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdSetDeviceMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
