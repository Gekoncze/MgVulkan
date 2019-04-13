package cz.mg.vulkan;

public class PFNvkGetRenderAreaGranularity extends VkFunctionPointer {
    public PFNvkGetRenderAreaGranularity() {
    }

    public PFNvkGetRenderAreaGranularity(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetRenderAreaGranularity(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetRenderAreaGranularity(long value) {
        setValue(value);
    }

    public PFNvkGetRenderAreaGranularity(VkInstance instance) {
        super(instance, new VkString("vkGetRenderAreaGranularity"));
    }

    public void call(VkDevice device, VkRenderPass renderPass, VkExtent2D pGranularity){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getSinkAddress(), pGranularity != null ? pGranularity.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long renderPass, long pGranularity);
}
