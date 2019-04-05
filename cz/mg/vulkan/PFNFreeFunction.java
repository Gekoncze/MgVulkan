package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class PFNFreeFunction extends VulkanFunctionPointer {
    public PFNFreeFunction(){
        super(new PFNvkFreeFunction());
    }

    public PFNFreeFunction(PFNvkFreeFunction vk){
        super(vk);
    }

    @Override
    public PFNvkFreeFunction getVk(){
        return (PFNvkFreeFunction) super.getVk();
    }

    public PFNFreeFunction(long value){
        super(value);
    }
}
