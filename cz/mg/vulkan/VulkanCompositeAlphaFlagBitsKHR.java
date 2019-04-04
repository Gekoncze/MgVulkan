package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagBitsKHR.html">khronos documentation</a>
 **/
public class VulkanCompositeAlphaFlagBitsKHR extends VulkanFlagBits {
    public static final int COMPOSITE_ALPHA_OPAQUE_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
    public static final int COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR;
    public static final int COMPOSITE_ALPHA_POST_MULTIPLIED_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR;
    public static final int COMPOSITE_ALPHA_INHERIT_KHR = VkCompositeAlphaFlagBitsKHR.VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;

    public VulkanCompositeAlphaFlagBitsKHR(){
        super(new VkCompositeAlphaFlagBitsKHR());
    }

    public VulkanCompositeAlphaFlagBitsKHR(VkCompositeAlphaFlagBitsKHR vk){
        super(vk);
    }

    @Override
    public VkCompositeAlphaFlagBitsKHR getVk(){
        return (VkCompositeAlphaFlagBitsKHR) super.getVk();
    }

    public VulkanCompositeAlphaFlagBitsKHR(int value){
        super(new VkCompositeAlphaFlagBitsKHR(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == COMPOSITE_ALPHA_OPAQUE_KHR) s += "COMPOSITE_ALPHA_OPAQUE_KHR";
        if(getValue() == COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR) s += "COMPOSITE_ALPHA_PRE_MULTIPLIED_KHR";
        if(getValue() == COMPOSITE_ALPHA_POST_MULTIPLIED_KHR) s += "COMPOSITE_ALPHA_POST_MULTIPLIED_KHR";
        if(getValue() == COMPOSITE_ALPHA_INHERIT_KHR) s += "COMPOSITE_ALPHA_INHERIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanCompositeAlphaFlagBitsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanCompositeAlphaFlagBitsKHR> {
        public Array(VkCompositeAlphaFlagBitsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCompositeAlphaFlagBitsKHR.Array(count));
        }

        public Array(int count, VulkanCompositeAlphaFlagBitsKHR o){
            this(new VkCompositeAlphaFlagBitsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkCompositeAlphaFlagBitsKHR.Array getVk(){
            return (VkCompositeAlphaFlagBitsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCompositeAlphaFlagBitsKHR get(int i){
            return new VulkanCompositeAlphaFlagBitsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCompositeAlphaFlagBitsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCompositeAlphaFlagBitsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkCompositeAlphaFlagBitsKHR.Pointer(value));
        }

        @Override
        public VkCompositeAlphaFlagBitsKHR.Pointer getVk(){
            return (VkCompositeAlphaFlagBitsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanCompositeAlphaFlagBitsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCompositeAlphaFlagBitsKHR.Pointer> {
            public Array(int count) {
                super(new VkCompositeAlphaFlagBitsKHR.Pointer.Array(count));
            }

            public Array(VulkanCompositeAlphaFlagBitsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCompositeAlphaFlagBitsKHR.Pointer.Array getVk(){
                return (VkCompositeAlphaFlagBitsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCompositeAlphaFlagBitsKHR.Pointer get(int i){
                return new VulkanCompositeAlphaFlagBitsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
