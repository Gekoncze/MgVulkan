package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFunctionPointer extends VulkanObject {
    public static final long NULL = VkFunctionPointer.NULL;

    public VulkanFunctionPointer(){
        super(new VkFunctionPointer());
    }

    public VulkanFunctionPointer(VkFunctionPointer vk){
        super(vk);
    }

    @Override
    public VkFunctionPointer getVk(){
        return (VkFunctionPointer) super.getVk();
    }

    public VulkanFunctionPointer(long value){
        this();
        setValue(value);
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }
}
