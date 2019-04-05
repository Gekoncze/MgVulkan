package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubpassSampleLocationsEXT extends VulkanObject {
    public VulkanSubpassSampleLocationsEXT(){
        super(new VkSubpassSampleLocationsEXT());
    }

    public VulkanSubpassSampleLocationsEXT(VkSubpassSampleLocationsEXT vk){
        super(vk);
    }

    @Override
    public VkSubpassSampleLocationsEXT getVk(){
        return (VkSubpassSampleLocationsEXT) super.getVk();
    }

    public VulkanSubpassSampleLocationsEXT(VulkanUInt32 subpassIndex, VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        super(new VkSubpassSampleLocationsEXT(subpassIndex.getVk(), sampleLocationsInfo.getVk()));
    }

    public VulkanUInt32 getSubpassIndex() {
        return new VulkanUInt32(getVk().getSubpassIndex());
    }

    public void setSubpassIndex(VulkanUInt32 subpassIndex) {
        getVk().setSubpassIndex(subpassIndex.getVk());
    }

    public VulkanSampleLocationsInfoEXT getSampleLocationsInfo() {
        return new VulkanSampleLocationsInfoEXT(getVk().getSampleLocationsInfo());
    }

    public void setSampleLocationsInfo(VulkanSampleLocationsInfoEXT sampleLocationsInfo) {
        getVk().setSampleLocationsInfo(sampleLocationsInfo.getVk());
    }


    public static class Array extends VulkanSubpassSampleLocationsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassSampleLocationsEXT> {
        public Array(VkSubpassSampleLocationsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassSampleLocationsEXT.Array(count));
        }

        public Array(int count, VulkanSubpassSampleLocationsEXT o){
            this(new VkSubpassSampleLocationsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassSampleLocationsEXT.Array getVk(){
            return (VkSubpassSampleLocationsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassSampleLocationsEXT get(int i){
            return new VulkanSubpassSampleLocationsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassSampleLocationsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassSampleLocationsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassSampleLocationsEXT.Pointer(value));
        }

        @Override
        public VkSubpassSampleLocationsEXT.Pointer getVk(){
            return (VkSubpassSampleLocationsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassSampleLocationsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassSampleLocationsEXT.Pointer> {
            public Array(int count) {
                super(new VkSubpassSampleLocationsEXT.Pointer.Array(count));
            }

            public Array(VulkanSubpassSampleLocationsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassSampleLocationsEXT.Pointer.Array getVk(){
                return (VkSubpassSampleLocationsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassSampleLocationsEXT.Pointer get(int i){
                return new VulkanSubpassSampleLocationsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
