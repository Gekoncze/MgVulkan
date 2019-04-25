package cz.mg.vulkan;

public class PFNvkCmdDispatchBaseKHX extends VkFunctionPointer {
    public PFNvkCmdDispatchBaseKHX() {
    }

    public PFNvkCmdDispatchBaseKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchBaseKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDispatchBaseKHX(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchBaseKHX(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchBaseKHX"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 baseGroupX, VkUInt32 baseGroupY, VkUInt32 baseGroupZ, VkUInt32 groupCountX, VkUInt32 groupCountY, VkUInt32 groupCountZ){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupX != null ? baseGroupX.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupY != null ? baseGroupY.getVkAddress() : VkPointer.getNullAddressNative(), baseGroupZ != null ? baseGroupZ.getVkAddress() : VkPointer.getNullAddressNative(), groupCountX != null ? groupCountX.getVkAddress() : VkPointer.getNullAddressNative(), groupCountY != null ? groupCountY.getVkAddress() : VkPointer.getNullAddressNative(), groupCountZ != null ? groupCountZ.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long baseGroupX, long baseGroupY, long baseGroupZ, long groupCountX, long groupCountY, long groupCountZ);
}
