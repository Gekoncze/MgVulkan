package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutTokenNVX.html">khronos documentation</a>
 **/
public class VulkanIndirectCommandsLayoutTokenNVX extends VulkanObject {
    public VulkanIndirectCommandsLayoutTokenNVX(){
        super(new VkIndirectCommandsLayoutTokenNVX());
    }

    public VulkanIndirectCommandsLayoutTokenNVX(VkIndirectCommandsLayoutTokenNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutTokenNVX getVk(){
        return (VkIndirectCommandsLayoutTokenNVX) super.getVk();
    }

    public VulkanIndirectCommandsLayoutTokenNVX(VulkanIndirectCommandsTokenTypeNVX tokenType, VulkanUInt32 bindingUnit, VulkanUInt32 dynamicCount, VulkanUInt32 divisor) {
        super(new VkIndirectCommandsLayoutTokenNVX(tokenType.getVk(), bindingUnit.getVk(), dynamicCount.getVk(), divisor.getVk()));
    }

    public VulkanIndirectCommandsTokenTypeNVX getTokenType() {
        return new VulkanIndirectCommandsTokenTypeNVX(getVk().getTokenType());
    }

    public void setTokenType(VulkanIndirectCommandsTokenTypeNVX tokenType) {
        getVk().setTokenType(tokenType.getVk());
    }

    public VulkanUInt32 getBindingUnit() {
        return new VulkanUInt32(getVk().getBindingUnit());
    }

    public void setBindingUnit(VulkanUInt32 bindingUnit) {
        getVk().setBindingUnit(bindingUnit.getVk());
    }

    public VulkanUInt32 getDynamicCount() {
        return new VulkanUInt32(getVk().getDynamicCount());
    }

    public void setDynamicCount(VulkanUInt32 dynamicCount) {
        getVk().setDynamicCount(dynamicCount.getVk());
    }

    public VulkanUInt32 getDivisor() {
        return new VulkanUInt32(getVk().getDivisor());
    }

    public void setDivisor(VulkanUInt32 divisor) {
        getVk().setDivisor(divisor.getVk());
    }


    public static class Array extends VulkanIndirectCommandsLayoutTokenNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutTokenNVX> {
        public Array(VkIndirectCommandsLayoutTokenNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkIndirectCommandsLayoutTokenNVX.Array(count));
        }

        public Array(int count, VulkanIndirectCommandsLayoutTokenNVX o){
            this(new VkIndirectCommandsLayoutTokenNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutTokenNVX.Array getVk(){
            return (VkIndirectCommandsLayoutTokenNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutTokenNVX get(int i){
            return new VulkanIndirectCommandsLayoutTokenNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkIndirectCommandsLayoutTokenNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkIndirectCommandsLayoutTokenNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkIndirectCommandsLayoutTokenNVX.Pointer(value));
        }

        @Override
        public VkIndirectCommandsLayoutTokenNVX.Pointer getVk(){
            return (VkIndirectCommandsLayoutTokenNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanIndirectCommandsLayoutTokenNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutTokenNVX.Pointer> {
            public Array(int count) {
                super(new VkIndirectCommandsLayoutTokenNVX.Pointer.Array(count));
            }

            public Array(VulkanIndirectCommandsLayoutTokenNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkIndirectCommandsLayoutTokenNVX.Pointer.Array getVk(){
                return (VkIndirectCommandsLayoutTokenNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanIndirectCommandsLayoutTokenNVX.Pointer get(int i){
                return new VulkanIndirectCommandsLayoutTokenNVX.Pointer(getVk().get(i));
            }
        }
    }
}
