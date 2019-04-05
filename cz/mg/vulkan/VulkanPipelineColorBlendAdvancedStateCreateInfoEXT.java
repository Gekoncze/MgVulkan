package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineColorBlendAdvancedStateCreateInfoEXT extends VulkanObject {
    public VulkanPipelineColorBlendAdvancedStateCreateInfoEXT(){
        super(new VkPipelineColorBlendAdvancedStateCreateInfoEXT());
    }

    public VulkanPipelineColorBlendAdvancedStateCreateInfoEXT(VkPipelineColorBlendAdvancedStateCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT getVk(){
        return (VkPipelineColorBlendAdvancedStateCreateInfoEXT) super.getVk();
    }
    public VulkanPipelineColorBlendAdvancedStateCreateInfoEXT(VulkanObject pNext, VulkanBool32 srcPremultiplied, VulkanBool32 dstPremultiplied, VulkanBlendOverlapEXT blendOverlap) {
        super(new VkPipelineColorBlendAdvancedStateCreateInfoEXT(pNext.getVk(), srcPremultiplied.getVk(), dstPremultiplied.getVk(), blendOverlap.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanBool32 getSrcPremultiplied() {
        return new VulkanBool32(getVk().getSrcPremultiplied());
    }

    public void setSrcPremultiplied(VulkanBool32 srcPremultiplied) {
        getVk().setSrcPremultiplied(srcPremultiplied.getVk());
    }

    public VulkanBool32 getDstPremultiplied() {
        return new VulkanBool32(getVk().getDstPremultiplied());
    }

    public void setDstPremultiplied(VulkanBool32 dstPremultiplied) {
        getVk().setDstPremultiplied(dstPremultiplied.getVk());
    }

    public VulkanBlendOverlapEXT getBlendOverlap() {
        return new VulkanBlendOverlapEXT(getVk().getBlendOverlap());
    }

    public void setBlendOverlap(VulkanBlendOverlapEXT blendOverlap) {
        getVk().setBlendOverlap(blendOverlap.getVk());
    }


    public static class Array extends VulkanPipelineColorBlendAdvancedStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendAdvancedStateCreateInfoEXT> {
        public Array(VkPipelineColorBlendAdvancedStateCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanPipelineColorBlendAdvancedStateCreateInfoEXT o){
            this(new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Array getVk(){
            return (VkPipelineColorBlendAdvancedStateCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineColorBlendAdvancedStateCreateInfoEXT get(int i){
            return new VulkanPipelineColorBlendAdvancedStateCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer getVk(){
            return (VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineColorBlendAdvancedStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer.Array getVk(){
                return (VkPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer get(int i){
                return new VulkanPipelineColorBlendAdvancedStateCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
