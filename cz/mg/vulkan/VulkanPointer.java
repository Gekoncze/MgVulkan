package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPointer extends VulkanObject {
    public static final long NULL = VkPointer.NULL;

    public VulkanPointer(){
        super(new VkPointer());
    }

    public VulkanPointer(VkPointer vk){
        super(vk);
    }

    @Override
    public VkPointer getVk(){
        return (VkPointer) super.getVk();
    }

    public VulkanPointer(long value){
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
