package cz.mg.vulkan;

public class PFNvkCmdDispatchIndirect extends VkFunctionPointer {
    public PFNvkCmdDispatchIndirect() {
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset);
}
