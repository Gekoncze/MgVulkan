package cz.mg.vulkan.vk;

public class PFNvkCmdSetDepthBias extends VkFunctionPointer {
    public PFNvkCmdSetDepthBias() {
    }

    public PFNvkCmdSetDepthBias(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDepthBias(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDepthBias(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDepthBias(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDepthBias"));
    }

    public void call(VkCommandBuffer commandBuffer, VkFloat depthBiasConstantFactor, VkFloat depthBiasClamp, VkFloat depthBiasSlopeFactor){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.NULL_ADDRESS, depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.NULL_ADDRESS, depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long depthBiasConstantFactor, long depthBiasClamp, long depthBiasSlopeFactor);
}
