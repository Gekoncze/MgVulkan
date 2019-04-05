package cz.mg.vulkan.vk;

public class PFNvkCmdSetDeviceMaskKHR extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMaskKHR() {
    }

    public PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDeviceMaskKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDeviceMaskKHR(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMaskKHR(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMaskKHR"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, deviceMask != null ? deviceMask.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
