package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class PFNVoidFunction extends VulkanFunctionPointer {
    public PFNVoidFunction(){
        super(new PFNvkVoidFunction());
    }

    public PFNVoidFunction(PFNvkVoidFunction vk){
        super(vk);
    }

    @Override
    public PFNvkVoidFunction getVk(){
        return (PFNvkVoidFunction) super.getVk();
    }

    public PFNVoidFunction(long value){
        super(value);
    }
}
