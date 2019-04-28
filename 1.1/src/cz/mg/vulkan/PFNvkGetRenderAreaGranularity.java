package cz.mg.vulkan;

public class PFNvkGetRenderAreaGranularity extends VkFunctionPointer {
    public PFNvkGetRenderAreaGranularity() {
    }

    protected PFNvkGetRenderAreaGranularity(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetRenderAreaGranularity(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetRenderAreaGranularity(long value) {
        setValue(value);
    }

    public PFNvkGetRenderAreaGranularity(VkInstance instance) {
        super(instance, new VkString("vkGetRenderAreaGranularity"));
    }

    public void call(VkDevice device, VkRenderPass renderPass, VkExtent2D pGranularity){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), renderPass != null ? renderPass.getVkAddress() : VkPointer.getNullAddressNative(), pGranularity != null ? pGranularity.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long renderPass, long pGranularity);

}
