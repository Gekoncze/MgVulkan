package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPipelineSampleLocationsStateCreateInfoEXT.html">khronos documentation</a>
 **/
public class VulkanPipelineSampleLocationsStateCreateInfoEXT extends VulkanObject {
    public VulkanPipelineSampleLocationsStateCreateInfoEXT(){
        super(new VkPipelineSampleLocationsStateCreateInfoEXT());
    }

    public VulkanPipelineSampleLocationsStateCreateInfoEXT(VkPipelineSampleLocationsStateCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineSampleLocationsStateCreateInfoEXT getVk(){
        return (VkPipelineSampleLocationsStateCreateInfoEXT) super.getVk();
    }
    public VulkanPipelineSampleLocationsStateCreateInfoEXT(VulkanObject pNext, VulkanBool32 sampleLocationsEnable, VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        super(new VkPipelineSampleLocationsStateCreateInfoEXT(pNext.getVk(), sampleLocationsEnable.getVk(), sampleLocationsInfo.getVk()));
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

    public VulkanBool32 getSampleLocationsEnable() {
        return new VulkanBool32(getVk().getSampleLocationsEnable());
    }

    public void setSampleLocationsEnable(VulkanBool32 sampleLocationsEnable) {
        getVk().setSampleLocationsEnable(sampleLocationsEnable.getVk());
    }

    public VulkanSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VulkanSampleLocationsInfoEXT(getVk().getSampleLocationsInfo());
    }

    public void setSampleLocationsInfo(VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        getVk().setSampleLocationsInfo(sampleLocationsInfo.getVk());
    }


    public static class Array extends VulkanPipelineSampleLocationsStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineSampleLocationsStateCreateInfoEXT> {
        public Array(VkPipelineSampleLocationsStateCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineSampleLocationsStateCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanPipelineSampleLocationsStateCreateInfoEXT o){
            this(new VkPipelineSampleLocationsStateCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineSampleLocationsStateCreateInfoEXT.Array getVk(){
            return (VkPipelineSampleLocationsStateCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineSampleLocationsStateCreateInfoEXT get(int i){
            return new VulkanPipelineSampleLocationsStateCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineSampleLocationsStateCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineSampleLocationsStateCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineSampleLocationsStateCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkPipelineSampleLocationsStateCreateInfoEXT.Pointer getVk(){
            return (VkPipelineSampleLocationsStateCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineSampleLocationsStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineSampleLocationsStateCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineSampleLocationsStateCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineSampleLocationsStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineSampleLocationsStateCreateInfoEXT.Pointer.Array getVk(){
                return (VkPipelineSampleLocationsStateCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineSampleLocationsStateCreateInfoEXT.Pointer get(int i){
                return new VulkanPipelineSampleLocationsStateCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
