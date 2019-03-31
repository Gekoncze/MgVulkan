package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDepthBias.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), depthBiasConstantFactor != null ? depthBiasConstantFactor.getVkAddress() : VkPointer.NULL, depthBiasClamp != null ? depthBiasClamp.getVkAddress() : VkPointer.NULL, depthBiasSlopeFactor != null ? depthBiasSlopeFactor.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long depthBiasConstantFactor, long depthBiasClamp, long depthBiasSlopeFactor);
}
