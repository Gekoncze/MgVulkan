package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkStencilFaceFlagBits.html">khronos documentation</a>
 **/
public class VulkanStencilFaceFlagBits extends VulkanFlagBits {
    public static final int FRONT = VkStencilFaceFlagBits.VK_STENCIL_FACE_FRONT_BIT;
    public static final int BACK = VkStencilFaceFlagBits.VK_STENCIL_FACE_BACK_BIT;
    public static final int STENCIL_FRONT_AND_BACK = VkStencilFaceFlagBits.VK_STENCIL_FRONT_AND_BACK;

    public VulkanStencilFaceFlagBits(){
        super(new VkStencilFaceFlagBits());
    }

    public VulkanStencilFaceFlagBits(VkStencilFaceFlagBits vk){
        super(vk);
    }

    @Override
    public VkStencilFaceFlagBits getVk(){
        return (VkStencilFaceFlagBits) super.getVk();
    }

    public VulkanStencilFaceFlagBits(int value){
        super(new VkStencilFaceFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == FRONT) s += "FRONT";
        if(getValue() == BACK) s += "BACK";
        if(getValue() == STENCIL_FRONT_AND_BACK) s += "STENCIL_FRONT_AND_BACK";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanStencilFaceFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanStencilFaceFlagBits> {
        public Array(VkStencilFaceFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkStencilFaceFlagBits.Array(count));
        }

        public Array(int count, VulkanStencilFaceFlagBits o){
            this(new VkStencilFaceFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkStencilFaceFlagBits.Array getVk(){
            return (VkStencilFaceFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanStencilFaceFlagBits get(int i){
            return new VulkanStencilFaceFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkStencilFaceFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkStencilFaceFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkStencilFaceFlagBits.Pointer(value));
        }

        @Override
        public VkStencilFaceFlagBits.Pointer getVk(){
            return (VkStencilFaceFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanStencilFaceFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanStencilFaceFlagBits.Pointer> {
            public Array(int count) {
                super(new VkStencilFaceFlagBits.Pointer.Array(count));
            }

            public Array(VulkanStencilFaceFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkStencilFaceFlagBits.Pointer.Array getVk(){
                return (VkStencilFaceFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanStencilFaceFlagBits.Pointer get(int i){
                return new VulkanStencilFaceFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
