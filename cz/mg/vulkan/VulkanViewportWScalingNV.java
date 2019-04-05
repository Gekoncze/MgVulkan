package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanViewportWScalingNV extends VulkanObject {
    public VulkanViewportWScalingNV(){
        super(new VkViewportWScalingNV());
    }

    public VulkanViewportWScalingNV(VkViewportWScalingNV vk){
        super(vk);
    }

    @Override
    public VkViewportWScalingNV getVk(){
        return (VkViewportWScalingNV) super.getVk();
    }

    public VulkanViewportWScalingNV(VulkanFloat xcoeff, VulkanFloat ycoeff) {
        super(new VkViewportWScalingNV(xcoeff.getVk(), ycoeff.getVk()));
    }

    public VulkanFloat getXcoeff() {
        return new VulkanFloat(getVk().getXcoeff());
    }

    public void setXcoeff(VulkanFloat xcoeff) {
        getVk().setXcoeff(xcoeff.getVk());
    }

    public VulkanFloat getYcoeff() {
        return new VulkanFloat(getVk().getYcoeff());
    }

    public void setYcoeff(VulkanFloat ycoeff) {
        getVk().setYcoeff(ycoeff.getVk());
    }


    public static class Array extends VulkanViewportWScalingNV implements cz.mg.collections.array.ReadonlyArray<VulkanViewportWScalingNV> {
        public Array(VkViewportWScalingNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkViewportWScalingNV.Array(count));
        }

        public Array(int count, VulkanViewportWScalingNV o){
            this(new VkViewportWScalingNV.Array(count, o.getVk()));
        }

        @Override
        public VkViewportWScalingNV.Array getVk(){
            return (VkViewportWScalingNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanViewportWScalingNV get(int i){
            return new VulkanViewportWScalingNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkViewportWScalingNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkViewportWScalingNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkViewportWScalingNV.Pointer(value));
        }

        @Override
        public VkViewportWScalingNV.Pointer getVk(){
            return (VkViewportWScalingNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanViewportWScalingNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanViewportWScalingNV.Pointer> {
            public Array(int count) {
                super(new VkViewportWScalingNV.Pointer.Array(count));
            }

            public Array(VulkanViewportWScalingNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkViewportWScalingNV.Pointer.Array getVk(){
                return (VkViewportWScalingNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanViewportWScalingNV.Pointer get(int i){
                return new VulkanViewportWScalingNV.Pointer(getVk().get(i));
            }
        }
    }
}
