package cz.mg.vulkan.vk;

public class PFNvkCmdReserveSpaceForCommandsNVX extends VkFunctionPointer {
    public PFNvkCmdReserveSpaceForCommandsNVX() {
    }

    public PFNvkCmdReserveSpaceForCommandsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdReserveSpaceForCommandsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdReserveSpaceForCommandsNVX(long value) {
        setValue(value);
    }

    public PFNvkCmdReserveSpaceForCommandsNVX(VkInstance instance) {
        super(instance, new VkString("vkCmdReserveSpaceForCommandsNVX"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, pReserveSpaceInfo != null ? pReserveSpaceInfo.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long pReserveSpaceInfo);
}
