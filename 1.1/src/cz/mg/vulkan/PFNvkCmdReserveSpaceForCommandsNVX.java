package cz.mg.vulkan;

public class PFNvkCmdReserveSpaceForCommandsNVX extends VkFunctionPointer {
    public PFNvkCmdReserveSpaceForCommandsNVX() {
    }

    protected PFNvkCmdReserveSpaceForCommandsNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdReserveSpaceForCommandsNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdReserveSpaceForCommandsNVX(long value) {
        setValue(value);
    }

    public PFNvkCmdReserveSpaceForCommandsNVX(VkInstance instance) {
        super(instance, new VkString("vkCmdReserveSpaceForCommandsNVX"));
    }

    public void call(VkCommandBuffer commandBuffer, VkCmdReserveSpaceForCommandsInfoNVX pReserveSpaceInfo){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), pReserveSpaceInfo != null ? pReserveSpaceInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long pReserveSpaceInfo);
}
